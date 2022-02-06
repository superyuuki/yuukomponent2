package com.superyuuki.yuukomponent.core;

public interface YuuKomponentProvider {

    YuuKomponentAPI createDefiner();

    byte priority();

}
