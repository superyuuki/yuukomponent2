package com.superyuuki.yuukomponent.core.persistence;

import java.util.Optional;
import java.util.UUID;

public interface Central {

    <R> Optional<R> retrieve(UUID uuid);

}
