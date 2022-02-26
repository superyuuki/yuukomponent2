package com.superyuuki.yuukomponent.api.concurrent.trait;

import net.tascalate.async.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

import static net.tascalate.async.CallContext.*;

public class MyImplementer implements MyTrait {

    private final Executor executor;
    private final Component component;

    public MyImplementer(Executor executor, Component component) {
        this.executor = executor;
        this.component = component;
    }

    @Override
    public @async CompletionStage<String> calculateSomething(int a) {

        String oo = await( component.as(MyTrait.class).calculateSomething(15) );

        return async(oo);
    }
}
