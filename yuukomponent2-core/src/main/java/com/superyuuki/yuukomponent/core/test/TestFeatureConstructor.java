package com.superyuuki.yuukomponent.core.test;

import com.superyuuki.yuukomponent.core.feature.trait.Trait;

public class TestFeatureConstructor<T extends Trait> implements FeatureConstructor<T> {

    private final Class<T> test;
    private final FeatureConstructor<?> constructor;

    public TestFeatureConstructor(Class<T> test, FeatureConstructor<?> constructor) {
        this.test = test;
        this.constructor = constructor;
    }

    @Override
    public T produce(Conduit conduit) {
        Trait trait = constructor.produce(conduit);

        return test.cast(trait); //cast up TODO performance issues
    }
}
