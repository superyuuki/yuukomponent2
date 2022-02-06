package com.superyuuki.yuukomponent.core.feature.function;

import com.superyuuki.yuukomponent.core.feature.Feature;

import java.util.Optional;

public interface Dictionary {

    <T extends Behavior> Optional<T> translate(Feature trait, Class<T> clazz);

}
