package com.superyuuki.yuukomponent.core.feature.registrar;

import com.superyuuki.yuukomponent.core.feature.function.Dictionary;
import com.superyuuki.yuukomponent.core.feature.function.Behavior;
import com.superyuuki.yuukomponent.core.feature.trait.Trait;
import com.superyuuki.yuukomponent.core.feature.function.Diction;
import com.superyuuki.yuukomponent.core.feature.trait.Translate;
import com.superyuuki.yuukomponent.core.feature.trait.Translator;

public interface TraitRegistrar {

    <T extends Trait, R extends Behavior> void registerTrait(Class<T> trait, Class<R> functionality, Translate<T> translate, Diction<R> diction);

    Dictionary buildDictionary();
    Translator buildTranslator();
}
