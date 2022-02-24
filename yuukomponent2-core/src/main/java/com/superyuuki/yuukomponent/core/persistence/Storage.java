package com.superyuuki.yuukomponent.core.persistence;

import java.util.Map;
import java.util.Optional;

public interface Storage {

    Optional<byte[]> read(String key);
    void write(String key, byte[] data);

    Map<String, byte[]> export();

}
