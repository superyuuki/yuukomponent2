package com.superyuuki.yuukomponent.core.persistence;

import com.superyuuki.yuukomponent.core.aspect.compile.Trait;

import java.util.Optional;
import java.util.UUID;

public interface Central {

    <R extends Trait> Optional<R> retrieve(UUID uuid);

}
