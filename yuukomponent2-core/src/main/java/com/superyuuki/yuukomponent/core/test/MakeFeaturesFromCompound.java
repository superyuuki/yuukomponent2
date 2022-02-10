package com.superyuuki.yuukomponent.core.test;

import com.superyuuki.yuukomponent.core.Event;
import com.superyuuki.yuukomponent.core.feature.inbuilt.interact.InteractEvent;
import com.superyuuki.yuukomponent.core.feature.inbuilt.interact.InteractTrait;
import com.superyuuki.yuukomponent.core.feature.trait.Trait;

import java.util.Optional;

public class MakeFeaturesFromCompound {

    interface CorrectOpen {
        <T extends Trait> Optional<Conduit> make(FeatureConstructor<T> constructor);
    }


    public class InteractHandle implements CorrectOpen {

        @Override
        public <T extends Trait> Optional<Conduit> make(FeatureConstructor<T> constructor) {

        }
    }

    public class InteractConduit2 implements Conduit {

        private final FeatureConstructor<InteractTrait> function;

        public InteractConduit2(FeatureConstructor<InteractTrait> function) {
            this.function = function;
        }

        @Override
        public void fire(Conduit self, Event event) {
            if (event instanceof InteractEvent subEvent) {
                InteractTrait trait = function.produce(self);

                trait.onClick(subEvent.data());
            }
        }
    }


}
