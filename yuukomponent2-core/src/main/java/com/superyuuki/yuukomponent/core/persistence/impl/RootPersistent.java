package com.superyuuki.yuukomponent.core.persistence.impl;

import com.superyuuki.yuukomponent.core.persistence.Persistent;
import com.superyuuki.yuukomponent.core.persistence.Storage;
import org.bukkit.inventory.ItemStack;

public class RootPersistent implements Persistent {

    private final String type;

    private final Storage data;

    private final ItemStack stack;

    public RootPersistent(String type, Storage data, ItemStack stack) {
        this.type = type;
        this.data = data;
        this.stack = stack;
    }


    @Override
    public String type() {
        return null;
    }

    @Override
    public Storage data() {
        return null;
    }

    @Override
    public void save() {
        //save self storage to stack

        //get other component ids

        //tell them to save
    }
}
