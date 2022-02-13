package com.superyuuki.yuukomponent.core;


import com.superyuuki.yuukomponent.api.YuuKomponentAPI;
import com.superyuuki.yuukomponent.api.aspect.Registrar;

public class CoreAPI implements YuuKomponentAPI {

    private final Registrar instance = null;

    @Override
    public Registrar registrar() {
        return instance;
    }
}
