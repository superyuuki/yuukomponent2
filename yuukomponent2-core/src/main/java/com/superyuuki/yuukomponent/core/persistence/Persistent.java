package com.superyuuki.yuukomponent.core.persistence;

import com.superyuuki.yuukomponent.core.feature.Feature;

/**
 * Represents a component
 */
public interface Persistent {

    Feature asTrait();

    void save();

}
