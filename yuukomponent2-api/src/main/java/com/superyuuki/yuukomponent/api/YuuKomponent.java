package com.superyuuki.yuukomponent.api;

import java.util.*;

public class YuuKomponent {

    private static final YuuKomponentAPI REGISTRAR;

    private YuuKomponent() {}

    static {
        REGISTRAR = getDefiner();
    }

    private static YuuKomponentAPI getDefiner() {
        ClassLoader classLoader = YuuKomponent.class.getClassLoader();
        ServiceLoader<YuuKomponentProvider> loader = ServiceLoader.load(YuuKomponentProvider.class, classLoader);
        Iterator<YuuKomponentProvider> it = loader.iterator();
        if (!it.hasNext()) {
            throw new IllegalStateException("No provider was found for yuukomponent!");
        }
        List<YuuKomponentProvider> providers = new ArrayList<>();
        do {
            providers.add(it.next());
        } while (it.hasNext());

        providers.sort(((Comparator<YuuKomponentProvider>) (o1, o2) -> o1.priority() - o2.priority()).reversed()); // reverse to use descending order
        return providers.get(0).createDefiner();
    }

    public static YuuKomponentAPI instance() {
        return REGISTRAR;
    }


}
