package com.superyuuki.yuukomponent.core.feature.function;

import com.superyuuki.yuukomponent.core.feature.Feature;

public interface Diction<T extends Behavior> {

    T from(Feature feature);

}
