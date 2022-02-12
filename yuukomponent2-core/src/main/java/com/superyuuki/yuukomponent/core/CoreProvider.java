package com.superyuuki.yuukomponent.core;

import com.superyuuki.yuukomponent.api.YuuKomponentAPI;
import com.superyuuki.yuukomponent.api.YuuKomponentProvider;

public class CoreProvider implements YuuKomponentProvider {
    @Override
    public YuuKomponentAPI createDefiner() {
        return new CoreAPI();
    }

    @Override
    public byte priority() {
        return 0;
    }
}
