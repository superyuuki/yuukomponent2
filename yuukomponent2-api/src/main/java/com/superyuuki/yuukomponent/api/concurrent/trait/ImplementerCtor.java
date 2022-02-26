package com.superyuuki.yuukomponent.api.concurrent.trait;

import java.util.concurrent.Executor;

public interface ImplementerCtor {

    Trait construct(Executor executor, Component component);

}
