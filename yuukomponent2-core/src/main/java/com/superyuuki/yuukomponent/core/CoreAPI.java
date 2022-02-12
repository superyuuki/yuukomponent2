package com.superyuuki.yuukomponent.core;


import com.superyuuki.yuukomponent.api.YuuKomponentAPI;
import com.superyuuki.yuukomponent.api.aspect.TraitRegistrar;

public class CoreAPI implements YuuKomponentAPI {

    private final TraitRegistrar instance = null;

    @Override
    public TraitRegistrar registrar() {
        return instance;
    }
}
