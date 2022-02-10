package com.superyuuki.yuukomponent.core.test;

import com.google.common.base.Function;
import com.superyuuki.yuukomponent.core.feature.inbuilt.interact.InteractTrait;
import com.superyuuki.yuukomponent.core.feature.trait.Trait;

public class CustomFeature implements InteractTrait {

    private final Conduit self;

    public CustomFeature(Conduit self) {
        this.self = self;
    }

    @Override
    public boolean onClick(int data) {


        FeatureConstructor<Trait> customTrait = CustomFeature::new;

        //how do we reliably test what type of trait this produces, and cast it to any special trait

        if (traitProduced.equals(InteractTrait.class)) {
            FeatureConstructor<InteractTrait> lah = (FeatureConstructor<InteractTrait>) customTrait;
        }

        Function<Conduit, CustomFeature> aNew = CustomFeature::new;

        return false;
    }
}
