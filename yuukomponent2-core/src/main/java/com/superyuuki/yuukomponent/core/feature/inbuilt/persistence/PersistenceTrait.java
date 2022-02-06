package com.superyuuki.yuukomponent.core.feature.inbuilt.persistence;

import com.superyuuki.yuukomponent.core.feature.trait.Trait;
import org.bukkit.persistence.PersistentDataContainer;

public interface PersistenceTrait extends Trait {

    void load(PersistentDataContainer container);
    void save(PersistentDataContainer container);

}
