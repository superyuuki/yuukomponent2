package com.superyuuki.yuukomponent.api.aspect.compile;

import com.superyuuki.yuukomponent.api.aspect.feature.CustomConstructor;
import com.superyuuki.yuukomponent.api.aspect.feature.Feature;
import com.superyuuki.yuukomponent.api.aspect.feature.TraitConstructor;

import java.util.Optional;

public class TypedCompiler<T extends Trait> implements Compiler {

    private final Class<T> clazz;
    private final TraitConstructor<T> traitConstructor;

    public TypedCompiler(Class<T> clazz, TraitConstructor<T> traitConstructor) {
        this.clazz = clazz;
        this.traitConstructor = traitConstructor;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Optional<Feature> make(CustomConstructor<?> constructor) {

        Trait trait = constructor.produce(null, null); //TODO empty position, empty progression

        if (clazz.isInstance(trait)) {
            return Optional.of(traitConstructor.make((CustomConstructor<T>) constructor));
        }

        return Optional.empty();
    }

}
