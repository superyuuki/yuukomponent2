package com.superyuuki.yuukomponent.core.persistence.removal;

import com.github.benmanes.caffeine.cache.Cache;
import com.superyuuki.yuukomponent.api.runtime.System;
import com.superyuuki.yuukomponent.core.persistence.Persistent;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class RemovalSystem implements System {

    record Removal(long time, UUID toRemove) {}

    private final Set<Long> longs = new HashSet<>();
    private final Cache<UUID, Persistent> cache;

    public RemovalSystem(Cache<UUID, Persistent> cache) {
        this.cache = cache;
    }

    @Override
    public void tick(long num) {



    }


}
