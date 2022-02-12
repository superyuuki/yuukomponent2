package com.superyuuki.yuukomponent.api.aspect;

import com.superyuuki.yuukomponent.api.aspect.compile.Compiler;
import com.superyuuki.yuukomponent.api.aspect.compile.Trait;
import com.superyuuki.yuukomponent.api.aspect.diction.Dictionary;
import com.superyuuki.yuukomponent.api.aspect.feature.CustomConstructor;
import com.superyuuki.yuukomponent.api.aspect.feature.TraitConstructor;
import com.superyuuki.yuukomponent.api.aspect.diction.TranslationConstructor;

public interface TraitRegistrar {

    <T extends Trait> void registerTrait(Class<T> trait, TraitConstructor<T> traitConstructor, TranslationConstructor<T> translationConstructor);
    <T extends Trait> void registerFeature(CustomConstructor<T> constructor);

    Dictionary buildDictionary();
    Compiler buildCompiler();
}
