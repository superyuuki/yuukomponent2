package com.superyuuki.yuukomponent.api.concurrent;

import com.superyuuki.yuukomponent.api.aspect.Event;
import com.superyuuki.yuukomponent.api.aspect.Position;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

/**
 * Branch off of the execution tree, do an action that nothing depends on.
 */
public interface ReadOnly {

    void action(Position position, Event event);

    class Ignorant implements ConcurrentConduit {

        private final ReadOnly readOnly;

        public Ignorant(ReadOnly readOnly) {
            this.readOnly = readOnly;
        }

        @Override
        public CompletionStage<Context> handle(CompletionStage<Context> fromParent) {
            fromParent.thenAccept(ctx -> readOnly.action(ctx.position(), ctx.event()));

            return fromParent;
        }
    }

    class Threaded implements ConcurrentConduit {

        private final ReadOnly readOnly;
        private final Executor executor;

        public Threaded(ReadOnly readOnly, Executor executor) {
            this.readOnly = readOnly;
            this.executor = executor;
        }

        @Override
        public CompletionStage<Context> handle(CompletionStage<Context> fromParent) {
            fromParent.thenAcceptAsync(ctx -> readOnly.action(ctx.position(), ctx.event()), executor);

            return fromParent;
        }
    }

}
