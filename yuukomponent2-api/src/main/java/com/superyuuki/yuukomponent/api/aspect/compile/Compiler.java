package com.superyuuki.yuukomponent.api.aspect.compile;

import com.superyuuki.yuukomponent.api.aspect.feature.CustomConstructor;
import com.superyuuki.yuukomponent.api.aspect.feature.Feature;

import java.util.Optional;

public interface Compiler {

    Optional<Feature> make(CustomConstructor<?> constructor);

}
