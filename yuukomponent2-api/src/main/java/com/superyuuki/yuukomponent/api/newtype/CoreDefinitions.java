package com.superyuuki.yuukomponent.api.newtype;

import com.superyuuki.yuukomponent.api.aspect.Conduit;
import com.superyuuki.yuukomponent.api.aspect.Event;
import com.superyuuki.yuukomponent.api.aspect.Position;

import java.util.Map;

public class CoreDefinitions implements Definitions {

    private final Map<String, Conduit> conduits; //where compiled defs go

    public CoreDefinitions(Map<String, Conduit> conduits) {
        this.conduits = conduits;
    }

    @Override
    public void invoke(String type, Event event) {
        Conduit nullable = conduits.get(type);
        if (nullable == null) throw new IllegalStateException("no such type " + type);

        Position position = new CorePosition(nullable, nullable); //ultimate root component
        nullable.fire(position, event);
    }

    @Override
    public void invoke(Position positionalInvoker, String type, Event event) {

    }




}
