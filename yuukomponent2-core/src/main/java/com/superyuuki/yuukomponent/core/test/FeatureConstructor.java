package com.superyuuki.yuukomponent.core.test;

import com.superyuuki.yuukomponent.core.feature.trait.Trait;

public interface FeatureConstructor<T extends Trait> {

    T produce(Conduit conduit);

}
