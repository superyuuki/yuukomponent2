package com.superyuuki.yuukomponent.api.aspect.feature;

import com.superyuuki.yuukomponent.api.aspect.Event;
import com.superyuuki.yuukomponent.api.aspect.Position;

public interface Feature {

    /**
     * Handle an event
     * @param pos the position ctx
     * @param prog the progression context
     * @param event the event
     * @return whether this feature handled the event or not
     */
    boolean handle(Position pos, Progression prog, Event event);

}
