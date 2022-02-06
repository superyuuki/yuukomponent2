package com.superyuuki.yuukomponent.core.test;

import com.google.common.base.Function;
import com.superyuuki.yuukomponent.core.feature.Feature;
import com.superyuuki.yuukomponent.core.feature.inbuilt.interact.InteractTrait;

import java.util.function.BiFunction;

public class CustomFeature implements InteractTrait {

    private final Conduit self;

    public CustomFeature(Conduit self) {
        this.self = self;
    }

    @Override
    public boolean onClick(int data) {

        Function<Conduit, CustomFeature> aNew = CustomFeature::new;

        return false;
    }
}
