package com.superyuuki.yuukomponent.core;

import net.tascalate.async.async;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.*;

import static net.tascalate.async.CallContext.*;

public class MyClass {
    public @async CompletionStage<String> mergeStrings() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            String v = await( decorateStrings(i, "async ", " awaited") );
            result.append(v).append('\n');
        }
        return async(result.toString());
    }

    public @async CompletionStage<String> decorateStrings(int i, String prefix, String suffix) {
        String value = prefix + await( produceString("value " + i) ) + suffix;
        return async(value);
    }

    // Emulate some asynchronous business service call
    private static CompletionStage<String> produceString(String value) {
        return CompletableFuture.supplyAsync(() -> value, executor);
    }

    public static void main(String[] args) {
        new MyClass().mergeStrings().thenAccept(System.out::println);
    }

    private static final ExecutorService executor = Executors.newFixedThreadPool(4, new ThreadFactory() {
        @Override
        public Thread newThread(@NotNull Runnable r) {
            return new Thread(r, "mythread");
        }
    });
}
