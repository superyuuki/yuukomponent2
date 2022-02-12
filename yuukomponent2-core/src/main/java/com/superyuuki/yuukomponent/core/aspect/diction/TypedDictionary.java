package com.superyuuki.yuukomponent.core.aspect.diction;

import java.util.Optional;

public class TypedDictionary<R> implements Dictionary {

    private final Class<R> clazz;
    private final TranslationConstructor<R> method;

    public TypedDictionary(Class<R> clazz, TranslationConstructor<R> method) {
        this.clazz = clazz;
        this.method = method;
    }


    @Override
    public <T> Optional<T> translate(Entrance trait, Class<T> clazz) {
        if (clazz.equals(this.clazz)) {
            return Optional.of(clazz.cast(method.from(trait)));
        }

        return Optional.empty();
    }
}
