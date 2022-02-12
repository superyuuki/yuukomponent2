package com.superyuuki.yuukomponent.core.aspect.feature;

import com.superyuuki.yuukomponent.core.aspect.compile.Trait;

public interface Position {

    /**
     * Gets self as a trait
     * @param clazz type
     * @return trait
     */
    <T extends Trait> T selfAs(Class<T> clazz);

    /**
     * Gets parent as a trait
     * @param clazz type
     * @return trait
     */
    <T extends Trait> T parentAs(Class<T> clazz);

    /**
     * Gets root as a trait
     * @param clazz type
     * @return trait
     */
    <T extends Trait> T rootAs(Class<T> clazz);

}
