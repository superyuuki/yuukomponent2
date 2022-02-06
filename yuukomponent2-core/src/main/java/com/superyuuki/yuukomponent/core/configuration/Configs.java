package com.superyuuki.yuukomponent.core.configuration;

import net.tascalate.async.async;

import java.util.concurrent.CompletionStage;

public interface Configs {


    @async CompletionStage<Void> reload();

}
