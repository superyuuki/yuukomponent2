package com.superyuuki.yuukomponent.core.aspect.feature;

import com.superyuuki.yuukomponent.core.aspect.compile.Trait;

public interface CustomConstructor<T extends Trait> {

    T produce(Position pos, Progression prog);

}
