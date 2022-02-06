package com.superyuuki.yuukomponent.core.feature.utility;

public class Cancelled<T> implements Cancellable<T> {

    private final T t;

    Cancelled(T t) {
        this.t = t;
    }

    @Override
    public boolean isCancelled() {
        return true;
    }

    @Override
    public T value() {
        return t;
    }
}
