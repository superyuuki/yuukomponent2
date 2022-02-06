package com.superyuuki.yuukomponent.core.feature.function;

import com.superyuuki.yuukomponent.core.feature.Feature;

import java.util.List;
import java.util.Optional;

public class RootDictionary implements Dictionary {

    private final List<Dictionary> dicts;

    public RootDictionary(List<Dictionary> dicts) {
        this.dicts = dicts;
    }

    @Override
    public <T extends Behavior> Optional<T> translate(Feature trait, Class<T> clazz) {
        for (Dictionary dict : dicts) {
            var opt = dict.translate(trait, clazz);

            if (opt.isPresent()) return opt;
        }

        return Optional.empty();
    }
}
