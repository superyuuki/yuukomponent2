package com.superyuuki.yuukomponent.api.concurrent;

import com.superyuuki.yuukomponent.api.aspect.Event;
import com.superyuuki.yuukomponent.api.aspect.Position;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

public interface ReadWrite {

    Event action(Position position, Event event);

    class Ignorant implements ConcurrentConduit {

        private final ReadWrite readWrite;

        public Ignorant(ReadWrite readWrite) {
            this.readWrite = readWrite;
        }

        @Override
        public CompletionStage<Context> handle(CompletionStage<Context> fromParent) {
            return fromParent.thenApply(this::apply);
        }

        Context apply(Context context) {
            Position pos = context.position();
            Event event = readWrite.action(pos, context.event());

            return new Context(event, pos);
        }

    }

    class Threaded implements ConcurrentConduit {

        private final ReadWrite readWrite;
        private final Executor executor;

        public Threaded(ReadWrite readWrite, Executor executor) {
            this.readWrite = readWrite;
            this.executor = executor;
        }

        @Override
        public CompletionStage<Context> handle(CompletionStage<Context> fromParent) {
            return fromParent.thenApplyAsync(this::apply);
        }

        Context apply(Context context) {
            Position pos = context.position();
            Event newEvent = readWrite.action(pos, context.event());

            return new Context(newEvent, pos);
        }
    }

}
