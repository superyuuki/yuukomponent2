package com.superyuuki.yuukomponent.core.feature.inbuilt.interact;

import com.superyuuki.yuukomponent.core.Event;
import com.superyuuki.yuukomponent.core.feature.trait.Trait;
import com.superyuuki.yuukomponent.core.feature.trait.Blackhole;
import com.superyuuki.yuukomponent.core.feature.trait.Translatable;
import com.superyuuki.yuukomponent.core.YuuKomponent;
import com.superyuuki.yuukomponent.core.feature.utility.Cancellable;

public interface InteractTrait extends Trait {

    /**
     * method called when an item is right-clicked
     * @param data DATA
     */
    Cancellable<Void> onClick(int data);

    record ToTranslatable(InteractTrait aspect) implements Translatable {

        @Override
        public void accept(Event event, Blackhole blackhole) {
            if (event instanceof InteractEvent interactEvent) {
                var result = aspect.onClick(interactEvent.data());

                if (!result.isCancelled()) {
                    blackhole.forward(interactEvent);
                }
            }
        }
    }



}
