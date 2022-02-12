package com.superyuuki.yuukomponent.core.aspect.compile;

import com.superyuuki.yuukomponent.core.aspect.feature.CustomConstructor;
import com.superyuuki.yuukomponent.core.aspect.feature.Feature;

import java.util.Optional;

public interface Compiler {

    Optional<Feature> make(CustomConstructor<?> constructor);

}
