package com.superyuuki.yuukomponent.core.test;

import com.superyuuki.yuukomponent.core.MyClass;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MyClassTest {


    public void testSomeLogic() throws ExecutionException, InterruptedException {
        System.out.println("START");

        throw new IllegalStateException("NO");

        /*LoggerFactory.getLogger(MyClassTest.class).info(() -> "e");

        CompletableFuture<?> future = (CompletableFuture<?>) new MyClass().mergeStrings().thenAccept(strings -> {
            LoggerFactory.getLogger(MyClassTest.class).info(() -> "o");

            String a = Thread.currentThread().getName();

            LoggerFactory.getLogger(MyClassTest.class).info(() -> a);
        });

        Object strs = future.get();*/

    }

}
