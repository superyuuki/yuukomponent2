package com.superyuuki.yuukomponent.core.feature.factory;

import com.superyuuki.yuukomponent.core.feature.Feature;

public interface FeatureFactory {

    Feature produce(String identifier);

}
