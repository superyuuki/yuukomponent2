package com.superyuuki.yuukomponent.core.persistence.impl;

import com.github.benmanes.caffeine.cache.Cache;
import com.superyuuki.yuukomponent.api.aspect.compile.Trait;
import com.superyuuki.yuukomponent.core.persistence.Persistent;
import com.superyuuki.yuukomponent.core.persistence.Terminal;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class ItemStackTerminal implements Terminal<ItemStack> {

    private final Cache<UUID, Persistent> cache;

    public ItemStackTerminal(Cache<UUID, Persistent> cache) {
        this.cache = cache;
    }

    @Override
    public <R extends Trait> Persistent load(ItemStack data) {



        cache.get()

        return null;
    }
}
