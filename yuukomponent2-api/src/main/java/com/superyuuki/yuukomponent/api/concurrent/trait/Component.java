package com.superyuuki.yuukomponent.api.concurrent.trait;

public interface Component {

    <T extends Trait> T as(Class<T> trait);
}
