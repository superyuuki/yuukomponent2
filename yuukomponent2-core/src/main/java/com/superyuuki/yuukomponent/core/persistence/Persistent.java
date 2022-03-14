package com.superyuuki.yuukomponent.core.persistence;

public interface Persistent<T> {

    /**
     * Method called on cached value update
     * @param query persistent type
     */
    void update(T query);

    /**
     * Method called on cache invalidation
     */
    void save();

}
