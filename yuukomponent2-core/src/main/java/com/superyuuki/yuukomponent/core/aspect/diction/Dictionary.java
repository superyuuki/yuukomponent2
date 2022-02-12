package com.superyuuki.yuukomponent.core.aspect.diction;

import java.util.Optional;

public interface Dictionary {

    <T> Optional<T> translate(Entrance entrance, Class<T> clazz);

}
