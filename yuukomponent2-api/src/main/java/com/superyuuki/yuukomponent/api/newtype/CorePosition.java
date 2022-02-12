package com.superyuuki.yuukomponent.api.newtype;

import com.superyuuki.yuukomponent.api.aspect.Conduit;
import com.superyuuki.yuukomponent.api.aspect.Position;

public class CorePosition implements Position {

    private final Conduit self;
    private final Conduit root;

    public CorePosition(Conduit self, Conduit root) {
        this.self = self;
        this.root = root;
    }

    @Override
    public Conduit self() {
        return self;
    }


    @Override
    public Conduit root() {
        return root;
    }

}
