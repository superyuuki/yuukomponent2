package com.superyuuki.yuukomponent.core.feature.function;

import com.superyuuki.yuukomponent.core.feature.Feature;

import java.util.Optional;

public class TypedDictionary<R extends Behavior> implements Dictionary {

    private final Class<R> clazz;
    private final Diction<R> method;

    public TypedDictionary(Class<R> clazz, Diction<R> method) {
        this.clazz = clazz;
        this.method = method;
    }


    @Override
    public <T extends Behavior> Optional<T> translate(Feature trait, Class<T> clazz) {
        if (clazz.equals(this.clazz)) {
            return Optional.of(clazz.cast(method.from(trait)));
        }

        return Optional.empty();
    }
}
