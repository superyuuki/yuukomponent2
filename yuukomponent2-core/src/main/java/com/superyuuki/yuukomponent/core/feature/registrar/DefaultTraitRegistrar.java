package com.superyuuki.yuukomponent.core.feature.registrar;

import com.superyuuki.yuukomponent.core.feature.function.*;
import com.superyuuki.yuukomponent.core.feature.trait.*;

import java.util.ArrayList;
import java.util.List;

public class DefaultTraitRegistrar implements TraitRegistrar {

    private final List<TypedTranslator<?>> stagingTranslators = new ArrayList<>();
    private final List<TypedDictionary<?>> stagingDictionaries = new ArrayList<>();

    @Override
    public <T extends Trait, R extends Behavior> void registerTrait(Class<T> trait, Class<R> functionality, Translate<T> translate, Diction<R> diction) {

        stagingDictionaries.add(new TypedDictionary<>(functionality, diction));
        stagingTranslators.add(new TypedTranslator<>(trait, translate));
    }

    @Override
    public Dictionary buildDictionary() {
        List<Dictionary> send = new ArrayList<>(stagingDictionaries);

        return new RootDictionary(send);
    }

    @Override
    public Translator buildTranslator() {
        List<Translator> send = new ArrayList<>(stagingTranslators);

        return new RootTranslator(send);
    }
}
