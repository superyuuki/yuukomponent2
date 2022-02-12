package com.superyuuki.yuukomponent.core.aspect.feature;

import com.superyuuki.yuukomponent.core.Event;

import java.util.List;

public class CombinantFeature implements Feature {

    private final List<Feature> subfeatures;

    public CombinantFeature(List<Feature> subfeatures) {
        this.subfeatures = subfeatures;
    }


    @Override
    public boolean handle(Position pos, Progression prog, Event event) {

        boolean handledYet = false;

        for (Feature subfeature : subfeatures) {
            if (handledYet) break;

            handledYet = subfeature.handle(pos, prog, event);
        }

        return true; //TODO alternate implemention: throw an exception if more than one feature handles the event, since only one subfeat should handle
    }
}
