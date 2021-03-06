package com.superyuuki.yuukomponent.core.persistence;

import com.superyuuki.yuukomponent.api.aspect.compile.Trait;

public interface Terminal<T> {

    <R extends Trait> Persistent load(T data);

}
