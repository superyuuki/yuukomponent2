package com.superyuuki.yuukomponent.core.feature.trait;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RootTranslator implements Translator {

    private final List<Translator> translators;

    public RootTranslator(List<Translator> translators) {
        this.translators = translators;
    }

    @Override
    public Optional<Translatable> translate(Trait trait) {

        List<Translatable> subtraits = new ArrayList<>();

        for (Translator child : translators) {
            var toReturn = child.translate(trait);

            toReturn.ifPresent(subtraits::add);
        }

        if (subtraits.isEmpty()) return Optional.empty();

        return Optional.of(
                new DistributeTranslatable(subtraits.toArray(new Translatable[0]))
        );
    }
}
