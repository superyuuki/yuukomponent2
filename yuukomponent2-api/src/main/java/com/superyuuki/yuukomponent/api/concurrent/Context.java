package com.superyuuki.yuukomponent.api.concurrent;

import com.superyuuki.yuukomponent.api.aspect.Event;
import com.superyuuki.yuukomponent.api.aspect.Position;

public record Context(Event event, Position position) {
}
