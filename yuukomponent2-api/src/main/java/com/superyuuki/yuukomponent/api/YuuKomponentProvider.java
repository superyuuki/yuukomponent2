package com.superyuuki.yuukomponent.api;

public interface YuuKomponentProvider {

    YuuKomponentAPI createDefiner();

    byte priority();

}
