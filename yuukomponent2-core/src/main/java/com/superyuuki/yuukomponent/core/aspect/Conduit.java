package com.superyuuki.yuukomponent.core.aspect;

import com.superyuuki.yuukomponent.core.Event;
import com.superyuuki.yuukomponent.core.aspect.feature.Position;

public interface Conduit {

    void fire(Position pos, Event event);

}
