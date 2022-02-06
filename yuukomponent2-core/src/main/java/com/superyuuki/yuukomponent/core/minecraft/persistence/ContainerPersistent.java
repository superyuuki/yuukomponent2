package com.superyuuki.yuukomponent.core.minecraft.persistence;

import com.superyuuki.yuukomponent.core.persistence.Persistent;
import com.superyuuki.yuukomponent.core.feature.Feature;
import com.superyuuki.yuukomponent.core.feature.function.Dictionary;
import org.bukkit.persistence.PersistentDataContainer;

public class ContainerPersistent implements Persistent {

    private final Feature feat;
    private final PersistentDataContainer container;

    private final Dictionary dictionary;

    public ContainerPersistent(Feature feat, PersistentDataContainer container, Dictionary dictionary) {
        this.feat = feat;
        this.container = container;
        this.dictionary = dictionary;
    }

    @Override
    public Feature asTrait() {
        return feat;
    }

    @Override
    public void save() {

    }
}
