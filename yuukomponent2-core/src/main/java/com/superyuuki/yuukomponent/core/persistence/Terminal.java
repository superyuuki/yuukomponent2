package com.superyuuki.yuukomponent.core.persistence;

public interface Terminal<T> {

    <R> R load(T data);

}
