package com.superyuuki.yuukomponent.core.aspect.registrar;

import com.superyuuki.yuukomponent.core.aspect.compile.Compiler;
import com.superyuuki.yuukomponent.core.aspect.compile.Trait;
import com.superyuuki.yuukomponent.core.aspect.diction.Dictionary;
import com.superyuuki.yuukomponent.core.aspect.diction.TranslationConstructor;
import com.superyuuki.yuukomponent.core.aspect.feature.CustomConstructor;
import com.superyuuki.yuukomponent.core.aspect.feature.TraitConstructor;

public interface TraitRegistrar {

    <T extends Trait> void registerTrait(Class<T> trait, TraitConstructor<T> traitConstructor, TranslationConstructor<T> translationConstructor);
    <T extends Trait> void registerFeature(CustomConstructor<T> constructor);

    Dictionary buildDictionary();
    Compiler buildCompiler();
}
