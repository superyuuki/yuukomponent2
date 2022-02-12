package com.superyuuki.yuukomponent.api.aspect;

import com.superyuuki.yuukomponent.api.aspect.Conduit;
import com.superyuuki.yuukomponent.api.aspect.Event;
import com.superyuuki.yuukomponent.api.aspect.Position;
import com.superyuuki.yuukomponent.api.aspect.feature.Progression;
import com.superyuuki.yuukomponent.api.aspect.feature.Feature;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class FeatureConduit implements Conduit {

    private final Feature feature;
    private final List<Conduit> below;

    public FeatureConduit(Feature feature, List<Conduit> below) {
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
