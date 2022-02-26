package com.superyuuki.yuukomponent.api.concurrent.trait;

import java.util.concurrent.CompletionStage;

public interface MyTrait extends Trait {

    CompletionStage<String> calculateSomething(int a);

}
