package com.superyuuki.yuukomponent.api.newtype;

import com.superyuuki.yuukomponent.api.aspect.Event;
import com.superyuuki.yuukomponent.api.aspect.Position;

public interface Definitions {

    void invoke(String type, Event event); //invoke as root
    void invoke(Position positionalInvoker, String type, Event event); //invoke as child

}
