package com.superyuuki.yuukomponent.api.aspect;

import com.superyuuki.yuukomponent.api.newtype.CorePosition;

/**
 * positioner Conduit that sets up position correctly
 */
public class BaseConduit implements Conduit {

    private final Conduit functionality;

    public BaseConduit(Conduit functionality) {
        this.functionality = functionality;
    }

    @Override
    public void fire(Position pos, Event event) {

        if (pos.self() == this) { //to-self invoke
            invoke(pos, event);
        } else {
            Position childPos = new CorePosition(this, pos.root());

            invoke(childPos, event);
        }

    }

    void invoke(Position correctedPosition, Event event) {
        functionality.fire(correctedPosition, event);
    }
}
