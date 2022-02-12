package com.superyuuki.yuukomponent.api.aspect.feature;

import com.superyuuki.yuukomponent.api.aspect.Position;
import com.superyuuki.yuukomponent.api.aspect.compile.Trait;

public interface CustomConstructor<T extends Trait> {

    T produce(Position pos, Progression prog);

}
