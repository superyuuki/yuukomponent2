package com.superyuuki.yuukomponent.core.persistence;

public interface Persistent {

    String type();
    Storage data();

    void save();

}
