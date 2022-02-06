package com.superyuuki.yuukomponent.core.feature.trait;

import com.superyuuki.yuukomponent.core.Event;
import com.superyuuki.yuukomponent.core.feature.Feature;

import java.util.List;


/**
 * Feature composed by translators
 */
public class TranslatedFeature implements Feature {

    private final List<Feature> children;
    private final Translatable self;

    public TranslatedFeature(List<Feature> children, Translatable self) {
        this.children = children;
        this.self = self;
    }

    @Override
    public void handle(Event event) {

        self.accept(event, event1 -> {
            for (Feature aFeature : children) {
                aFeature.handle(event);
            }
        });

    }
}
