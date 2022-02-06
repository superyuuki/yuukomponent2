package com.superyuuki.yuukomponent.core.feature.inbuilt.interact;

import com.superyuuki.yuukomponent.core.YuuKomponent;
import com.superyuuki.yuukomponent.core.feature.function.Behavior;
import com.superyuuki.yuukomponent.core.feature.trait.Trait;

public class Interact {

    static {

        YuuKomponent.instance().registerTrait(Trait.class, Behavior.class, null, null);


    }

    public interface Trait extends com.superyuuki.yuukomponent.core.feature.trait.Trait {
        boolean interact(int data);

        int compute(com.superyuuki.yuukomponent.core.feature.trait.Trait parent);
    }

    public interface Behavior extends com.superyuuki.yuukomponent.core.feature.function.Behavior {
        void interact(int data);

        int compute();
    }

}
