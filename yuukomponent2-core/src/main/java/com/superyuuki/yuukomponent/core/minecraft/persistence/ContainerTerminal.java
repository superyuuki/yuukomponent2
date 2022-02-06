package com.superyuuki.yuukomponent.core.minecraft.persistence;

import com.github.benmanes.caffeine.cache.Cache;
import com.superyuuki.yuukomponent.core.persistence.Persistent;
import com.superyuuki.yuukomponent.core.persistence.Terminal;
import com.superyuuki.yuukomponent.core.feature.Feature;
import com.superyuuki.yuukomponent.core.feature.factory.FeatureFactory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.UUID;

public class ContainerTerminal implements Terminal<PersistentDataContainer> {

    private final Keys keys;
    private final FeatureFactory factory;

    private final Cache<UUID, Persistent> cache;

    public ContainerTerminal(Keys keys, FeatureFactory factory, Cache<UUID, Persistent> cache) {
        this.keys = keys;
        this.factory = factory;
        this.cache = cache;
    }

    @Override
    public <R> R load(PersistentDataContainer data) {

        String uuid = data.get(keys.ofKey("uuid"), PersistentDataType.STRING);
        assert uuid != null;

        Persistent persistent = cache.get(UUID.fromString(uuid), id -> {

            String key = data.get(keys.ofKey("type"), PersistentDataType.STRING);
            assert key != null;

            Feature root = factory.produce(key); //build self

            var pt = new ContainerPersistent(root, )
        })
    }
}
