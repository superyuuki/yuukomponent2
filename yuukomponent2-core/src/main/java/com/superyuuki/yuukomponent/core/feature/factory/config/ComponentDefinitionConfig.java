package com.superyuuki.yuukomponent.core.feature.factory.config;

import com.superyuuki.yuukonfig.Section;
import com.superyuuki.yuukonfig.annotate.ConfKey;

import java.util.List;
import java.util.Map;

public interface ComponentDefinitionConfig extends Section {

    @ConfKey("definitions")
    Map<String, Subsection> definitions();


    interface Subsection extends Section {

        List<Subsection> subsections();

    }


}
