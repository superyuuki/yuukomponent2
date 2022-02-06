package com.superyuuki.yuukomponent.core.feature.utility;

public class Completed<T> implements Cancellable<T> {

    private final T t;

    Completed(T t) {
        this.t = t;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public T value() {
        return t;
    }
}
