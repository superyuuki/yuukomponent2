package com.superyuuki.yuukomponent.core.feature.factory;

import com.superyuuki.yuukomponent.core.feature.Feature;

public interface ConfigFeatureProducer<C> {

    Feature feature(C config);

}
