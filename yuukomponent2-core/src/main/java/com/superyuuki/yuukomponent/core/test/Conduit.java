package com.superyuuki.yuukomponent.core.test;

import com.superyuuki.yuukomponent.core.Event;
import com.superyuuki.yuukomponent.core.feature.Feature;

public interface Conduit {

    void fire(Feature self, Event event);

}
