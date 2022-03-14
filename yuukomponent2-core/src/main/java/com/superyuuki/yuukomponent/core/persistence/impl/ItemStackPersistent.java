package com.superyuuki.yuukomponent.core.persistence.impl;

import com.superyuuki.yuukomponent.core.minecraft.persistence.Keys;
import com.superyuuki.yuukomponent.core.persistence.Persistent;
import com.superyuuki.yuukomponent.core.persistence.Storage;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class ItemStackPersistent implements Persistent<ItemStack> {

    private final Keys keys;
    private final Storage cachedVolatile;

    private final UUID uuid;

    public ItemStackPersistent(Keys keys, Storage cachedVolatile, UUID uuid) {
        this.keys = keys;
        this.cachedVolatile = cachedVolatile;
        this.uuid = uuid;
    }

    @Override
    public void update(ItemStack query) {
        PersistentDataContainer ctr = Objects.requireNonNull(query.getItemMeta(), "ItemMeta of YuuKomponentItem cannot be null!")
                .getPersistentDataContainer()
                .get(
                        keys.ofKey(
                                uuid.toString()
                        ),
                        PersistentDataType.TAG_CONTAINER
                );

        if (ctr == null) throw new IllegalStateException("No data container exists on itemstack for component with id: " + uuid);

        for (Map.Entry<String, byte[]> entry : cachedVolatile.export().entrySet()) {

            ctr.set(
                    keys.ofKey(
                            entry.getKey()
                    ),
                    PersistentDataType.BYTE_ARRAY,
                    entry.getValue()
            );

        }

        query.setItemMeta(meta);
    }

    @Override
    public void save() {
    }
}
