package com.superyuuki.yuukomponent.core.aspect.feature;

public interface Progression {

    /**
     * If progress is called, the event will move beyond this feature to the next output features
     */
    void progress();

}
