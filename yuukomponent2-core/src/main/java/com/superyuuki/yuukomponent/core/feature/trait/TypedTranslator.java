package com.superyuuki.yuukomponent.core.feature.trait;

import java.util.Optional;

public class TypedTranslator<T extends Trait> implements Translator {

    private final Class<T> type;
    private final Translate<T> method;

    public TypedTranslator(Class<T> type, Translate<T> method) {
        this.type = type;
        this.method = method;
    }

    @Override
    public Optional<Translatable> translate(Trait trait) {

        if (type.isInstance(trait)) {
            return Optional.of(method.from(type.cast(trait)));
        }

        return Optional.empty();
    }
}
