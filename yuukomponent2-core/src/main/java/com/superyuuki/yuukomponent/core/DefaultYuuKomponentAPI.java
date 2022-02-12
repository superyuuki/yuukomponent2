package com.superyuuki.yuukomponent.core;

import com.superyuuki.yuukomponent.core.aspect.registrar.TraitRegistrar;

public class DefaultYuuKomponentAPI implements YuuKomponentAPI {

    private final TraitRegistrar instance = null;

    @Override
    public TraitRegistrar registrar() {
        return instance;
    }
}
