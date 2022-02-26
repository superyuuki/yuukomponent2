package com.superyuuki.yuukomponent.api.concurrent;

import java.util.List;
import java.util.concurrent.CompletionStage;

public class CombinantConduit implements ConcurrentConduit {

    private final List<ConcurrentConduit> conduits;

    public CombinantConduit(List<ConcurrentConduit> conduits) {
        this.conduits = conduits;
    }

    @Override
    public CompletionStage<Context> handle(CompletionStage<Context> fromParent) {
        CompletionStage<Context> self = fromParent;
        for (ConcurrentConduit conduit : conduits) {
           self = conduit.handle(self); //build
        }

        return self;
    }
}
