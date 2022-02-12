package com.superyuuki.yuukomponent.core.aspect.feature;

import com.superyuuki.yuukomponent.core.aspect.compile.Trait;

public interface TraitConstructor<T extends Trait> {

    Feature make(CustomConstructor<T> constructor);

}
