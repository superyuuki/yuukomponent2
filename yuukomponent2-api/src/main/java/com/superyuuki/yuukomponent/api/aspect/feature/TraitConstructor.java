package com.superyuuki.yuukomponent.api.aspect.feature;

import com.superyuuki.yuukomponent.api.aspect.compile.Trait;

public interface TraitConstructor<T extends Trait> {

    Feature make(CustomConstructor<T> constructor);

}
