package com.superyuuki.yuukomponent.core.persistence;

import com.github.benmanes.caffeine.cache.RemovalCause;
import com.github.benmanes.caffeine.cache.RemovalListener;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.UUID;

public class PersistentRemovalListener implements RemovalListener<UUID, Persistent> {
    @Override
    public void onRemoval(@Nullable UUID uuid, @Nullable Persistent persistent, RemovalCause removalCause) {
        if (persistent != null) {
            persistent.save();
        }
    }
}
