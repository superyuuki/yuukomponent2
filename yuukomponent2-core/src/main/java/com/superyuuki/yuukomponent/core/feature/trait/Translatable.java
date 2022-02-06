package com.superyuuki.yuukomponent.core.feature.trait;

import com.superyuuki.yuukomponent.core.Event;

public interface Translatable {

    void accept(Event event, Blackhole blackhole);

}
