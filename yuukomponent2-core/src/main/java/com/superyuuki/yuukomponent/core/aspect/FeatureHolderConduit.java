package com.superyuuki.yuukomponent.core.aspect;

import com.superyuuki.yuukomponent.core.Event;
import com.superyuuki.yuukomponent.core.aspect.feature.Feature;
import com.superyuuki.yuukomponent.core.aspect.feature.Position;
import com.superyuuki.yuukomponent.core.aspect.feature.Progression;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class FeatureHolderConduit implements Conduit {

    private final Feature feature;
    private final List<Conduit> below;

    public FeatureHolderConduit(Feature feature, List<Conduit> below) {
        this.feature = feature;
        this.below = below;
    }

    @Override
    public void fire(Position pos, Event event) {

        Prog prog = new Prog();

        boolean handled = feature.handle(pos, prog, event);

        if (!handled || prog.isProg()) { //if not handled, pass. If handled and prog, pass
            for (Conduit conduit : below) {
                conduit.fire(pos, event);
            }
        }

    }

    static final class Prog implements Progression {

        private final AtomicBoolean atomicBoolean = new AtomicBoolean(false);

        @Override
        public void progress() {
            if (atomicBoolean.compareAndSet(false, true)) {
                throw new IllegalStateException("Progression already marked! Somehow, event was passed to 2 subfeatures");
            }
        }

        boolean isProg() {
            return atomicBoolean.get();
        }
    }
}
