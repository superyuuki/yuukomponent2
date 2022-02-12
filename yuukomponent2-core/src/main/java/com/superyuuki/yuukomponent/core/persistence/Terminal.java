package com.superyuuki.yuukomponent.core.persistence;

import com.superyuuki.yuukomponent.core.aspect.compile.Trait;

public interface Terminal<T> {

    <R extends Trait> R load(T data);

}
