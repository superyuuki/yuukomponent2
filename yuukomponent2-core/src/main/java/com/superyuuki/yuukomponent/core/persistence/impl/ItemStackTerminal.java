package com.superyuuki.yuukomponent.core.persistence.impl;

import com.github.benmanes.caffeine.cache.Cache;
import com.superyuuki.yuukomponent.api.aspect.compile.Trait;
import com.superyuuki.yuukomponent.core.minecraft.persistence.Keys;
import com.superyuuki.yuukomponent.core.persistence.Persistent;
import com.superyuuki.yuukomponent.core.persistence.Terminal;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class ItemStackTerminal implements Terminal<ItemStack> {

    private final Keys keys;
    private final Cache<UUID, Persistent<ItemStack>> cache;

    public ItemStackTerminal(Keys keys, Cache<UUID, Persistent<ItemStack>> cache) {
        this.keys = keys;
        this.cache = cache;
    }

    @Override
    public <R extends Trait> Persistent<ItemStack> load(ItemStack data) {

        ItemMeta meta = data.getItemMeta();
        if (meta == null) throw new IllegalStateException("ItemMeta cannot be null in a YuuKomponent Item!");
        PersistentDataContainer container = meta.getPersistentDataContainer();

        String kpairs = container.get(keys.ofKey("id-key-pairs"), PersistentDataType.STRING);
        if (kpairs == null) throw new IllegalStateException("YuuKomponent item has no key pairs!");

        String[] keys = kpairs.split("~");

        for (String stringKey : keys) {
            String[] typePair = stringKey.split("-");

            UUID myUUID = UUID.fromString(typePair[0]);
            String type = typePair[1];

            cache.get(myUUID, id -> {

            })

        }

        //...



        return null;
    }


}
