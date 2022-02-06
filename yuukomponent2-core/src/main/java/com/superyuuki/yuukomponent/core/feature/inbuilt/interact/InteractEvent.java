package com.superyuuki.yuukomponent.core.feature.inbuilt.interact;

import com.superyuuki.yuukomponent.core.Event;

public class InteractEvent implements Event {

    private final int data;

    public InteractEvent(int data) {
        this.data = data;
    }

    public int data() {
        return data;
    }
}
