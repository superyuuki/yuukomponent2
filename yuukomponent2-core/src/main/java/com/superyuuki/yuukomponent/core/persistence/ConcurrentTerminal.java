package com.superyuuki.yuukomponent.core.persistence;

import java.util.concurrent.CompletableFuture;

public interface ConcurrentTerminal<T> {

    //return valid data...
    <R> CompletableFuture<R> stage(T data);

}
