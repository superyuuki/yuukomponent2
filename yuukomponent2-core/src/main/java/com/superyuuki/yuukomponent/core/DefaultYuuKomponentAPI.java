package com.superyuuki.yuukomponent.core;

import com.superyuuki.yuukomponent.core.feature.registrar.DefaultTraitRegistrar;
import com.superyuuki.yuukomponent.core.feature.registrar.TraitRegistrar;

public class DefaultYuuKomponentAPI implements YuuKomponentAPI {

    private final TraitRegistrar instance = new DefaultTraitRegistrar();

    @Override
    public TraitRegistrar registrar() {
        return instance;
    }
}
