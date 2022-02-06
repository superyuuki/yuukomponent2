package com.superyuuki.yuukomponent.core.test;

import com.superyuuki.yuukomponent.core.Event;
import com.superyuuki.yuukomponent.core.feature.Feature;
import com.superyuuki.yuukomponent.core.feature.inbuilt.interact.InteractTrait;
import com.superyuuki.yuukomponent.core.feature.trait.Trait;

import java.util.function.Function;

public class MakeFeaturesFromCompound {


    <T extends Trait> Conduit make(Class<T> clazz, Function<Conduit, T> constructor) {




    }

    interface ShouldHandle {
        <T> Conduit make(Class<T> clazz, Function<Conduit, T> constructor);
    }

    public class InteractHandle implements ShouldHandle {

        @Override
        public <T> Conduit make(Class<T> clazz, Function<Conduit, T> constructor) {
            if (clazz.equals(InteractTrait.class)) {
                //sure, produce a cool epic feature!

                return new InteractConduit(constructor);

            }

            return null;
        }
    }

    public class InteractConduit implements Conduit {

        private final Function<Conduit, Trait> function;

        public InteractConduit(Function<Conduit, InteractTrait> function) {
            this.function = function;
        }


        @Override
        public void fire(Feature self, Event event) {

        }
    }

}
