package com.superyuuki.yuukomponent.core.feature;

import com.superyuuki.yuukomponent.core.feature.inbuilt.interact.InteractTrait;
import com.superyuuki.yuukomponent.core.feature.utility.Cancellable;

public class MyFeature implements InteractTrait {

    private final boolean shouldCancel;

    public MyFeature(boolean shouldCancel) {
        this.shouldCancel = shouldCancel;
    }

    @Override
    public Cancellable<Void> onClick(int data) {

        if (data > 5) return Cancellable.CANCEL;

        return Cancellable.COMPLETE;
    }
}
