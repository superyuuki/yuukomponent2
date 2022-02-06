package com.superyuuki.yuukomponent.core.feature.utility;

public interface Cancellable<T> {

    boolean isCancelled();

    T value();

    Cancellable<Void> COMPLETE = new Completed<>(null);
    Cancellable<Void> CANCEL = new Cancelled<>(null);

    static <T> Cancellable<T> complete(T value) {
        return new Completed<>(value);
    }

    static <T> Cancellable<T> cancel(T value) {
        return new Cancelled<>(value);
    }


}
