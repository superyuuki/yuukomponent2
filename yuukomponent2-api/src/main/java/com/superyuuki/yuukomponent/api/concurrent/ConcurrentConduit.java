package com.superyuuki.yuukomponent.api.concurrent;

import java.util.concurrent.CompletionStage;

public interface ConcurrentConduit {

    CompletionStage<Context> handle(CompletionStage<Context> fromParent);

}
