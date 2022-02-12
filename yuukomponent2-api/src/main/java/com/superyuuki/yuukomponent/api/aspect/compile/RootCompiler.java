package com.superyuuki.yuukomponent.api.aspect.compile;

import com.superyuuki.yuukomponent.api.aspect.feature.CombinantFeature;
import com.superyuuki.yuukomponent.api.aspect.feature.CustomConstructor;
import com.superyuuki.yuukomponent.api.aspect.feature.Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RootCompiler implements Compiler {

    private final List<Compiler> compilers;

    public RootCompiler(List<Compiler> compilers) {
        this.compilers = compilers;
    }

    @Override
    public Optional<Feature> make(CustomConstructor<?> constructor) {

        List<Feature> finished = new ArrayList<>();

        for (Compiler compiler : compilers) {
            var opt = compiler.make(constructor);

            opt.ifPresent(finished::add);
        }

        return Optional.of(new CombinantFeature(finished));
    }
}
