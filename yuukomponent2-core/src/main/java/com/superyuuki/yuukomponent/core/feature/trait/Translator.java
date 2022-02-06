package com.superyuuki.yuukomponent.core.feature.trait;

import java.util.Optional;

public interface Translator {

    Optional<Translatable> translate(Trait trait);

}
