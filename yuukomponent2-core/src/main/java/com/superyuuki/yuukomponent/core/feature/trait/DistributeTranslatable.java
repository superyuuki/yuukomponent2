package com.superyuuki.yuukomponent.core.feature.trait;

import com.superyuuki.yuukomponent.core.Event;

import java.util.List;

public class DistributeTranslatable implements Translatable {

    private final List<Translatable> more;

    public DistributeTranslatable(Translatable... more) {
        this.more = List.of(more);
    }

    @Override
    public void accept(Event event, Blackhole blackhole) {
        for (Translatable translatable : more) {
            translatable.accept(event, blackhole);
        }
    }


}
