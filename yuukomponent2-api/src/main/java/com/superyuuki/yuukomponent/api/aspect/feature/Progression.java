package com.superyuuki.yuukomponent.api.aspect.feature;

public interface Progression {

    /**
     * If progress is called, the event will move beyond this feature to the next output features
     */
    void progress();

}
