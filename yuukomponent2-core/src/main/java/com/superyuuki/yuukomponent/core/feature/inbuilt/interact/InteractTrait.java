package com.superyuuki.yuukomponent.core.feature.inbuilt.interact;

import com.superyuuki.yuukomponent.core.Event;
import com.superyuuki.yuukomponent.core.feature.trait.Trait;
import com.superyuuki.yuukomponent.core.feature.trait.Blackhole;
import com.superyuuki.yuukomponent.core.feature.trait.Translatable;

public interface InteractTrait extends Trait {

    boolean onClick(int data);

    class Translate implements Translatable {

        private final InteractTrait interactTrait;

        public Translate(InteractTrait interactTrait) {
            this.interactTrait = interactTrait;
        }

        @Override
        public void accept(Event event, Blackhole blackhole) {
            if (event instanceof Interact.Event event1) {
                boolean shouldFW = interactTrait.onClick(event1.data());

                if (shouldFW) {
                    blackhole.forward(event);
                }

                return;
            }

            blackhole.forward(event);
        }
    }

}
