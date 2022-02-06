package com.superyuuki.yuukomponent.core.feature.inbuilt.interact;

import com.superyuuki.yuukomponent.core.feature.Feature;
import com.superyuuki.yuukomponent.core.feature.function.Behavior;
import com.superyuuki.yuukomponent.core.feature.utility.Cancellable;

import static com.superyuuki.yuukomponent.core.feature.utility.Cancellable.COMPLETE;

public interface InteractBehavior extends Behavior {

    record ToTrait(Feature self) implements InteractTrait {

        @Override
        public Cancellable<Void> onClick(int data) {
            self.handle(new InteractEvent(data));

            return COMPLETE;
        }

    }
}
