package com.superyuuki.yuukomponent.core.aspect.diction;

import java.util.List;
import java.util.Optional;

public class RootDictionary implements Dictionary {

    private final List<Dictionary> dicts;

    public RootDictionary(List<Dictionary> dicts) {
        this.dicts = dicts;
    }

    @Override
    public <T> Optional<T> translate(Entrance trait, Class<T> clazz) {
        for (Dictionary dict : dicts) {
            var opt = dict.translate(trait, clazz);

            if (opt.isPresent()) return opt;
        }

        return Optional.empty();
    }
}
