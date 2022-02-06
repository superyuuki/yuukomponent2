package com.superyuuki.yuukomponent.core.feature;

import com.superyuuki.yuukomponent.core.Event;

public class RootFeature implements Feature {

    private final Feature delegate;

    public RootFeature(Feature delegate) {
        this.delegate = delegate;
    }

    @Override
    public void handle(Event event) {
        //TODO intercept, replace context parent as self

        delegate.handle(event);
    }
}
