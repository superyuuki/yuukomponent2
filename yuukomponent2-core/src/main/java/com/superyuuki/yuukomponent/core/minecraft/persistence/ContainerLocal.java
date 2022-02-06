package com.superyuuki.yuukomponent.core.minecraft.persistence;

import com.superyuuki.yuukomponent.core.persistence.local.PersistentLocal;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class ContainerLocal implements PersistentLocal {

    private final Keys keys;
    private final PersistentDataContainer container;

    public ContainerLocal(Keys keys, PersistentDataContainer container) {
        this.keys = keys;
        this.container = container;
    }

    @Override
    public void setSomeDataTest(String key, int number) {
        container.set(keys.ofKey(key), PersistentDataType.INTEGER, number);
    }
}
