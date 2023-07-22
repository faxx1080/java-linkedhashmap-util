package com.frank;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapUtil {

    private LinkedHashMapUtil () {}

    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1) {
        var lhm = new LinkedHashMap<K, V>();
        lhm.put(k1, v1);
        return lhm;
    }


    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        return lhm;
    }


    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        lhm.put(k3, v3);
        return lhm;
    }

    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        lhm.put(k3, v3);
        lhm.put(k4, v4);
        return lhm;
    }

    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        lhm.put(k3, v3);
        lhm.put(k4, v4);
        lhm.put(k5, v5);
        return lhm;
    }

    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,
                               K k6, V v6) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        lhm.put(k3, v3);
        lhm.put(k4, v4);
        lhm.put(k5, v5);
        lhm.put(k6, v6);
        return lhm;
    }

    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,
                               K k6, V v6, K k7, V v7) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        lhm.put(k3, v3);
        lhm.put(k4, v4);
        lhm.put(k5, v5);
        lhm.put(k6, v6);
        lhm.put(k7, v7);
        return lhm;
    }

    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,
                               K k6, V v6, K k7, V v7, K k8, V v8) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        lhm.put(k3, v3);
        lhm.put(k4, v4);
        lhm.put(k5, v5);
        lhm.put(k6, v6);
        lhm.put(k7, v7);
        lhm.put(k8, v8);
        return lhm;
    }

    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,
                               K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        lhm.put(k3, v3);
        lhm.put(k4, v4);
        lhm.put(k5, v5);
        lhm.put(k6, v6);
        lhm.put(k7, v7);
        lhm.put(k8, v8);
        lhm.put(k9, v9);
        return lhm;
    }

    public static <K, V> LinkedHashMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,
                               K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        lhm.put(k1, v1);
        lhm.put(k2, v2);
        lhm.put(k3, v3);
        lhm.put(k4, v4);
        lhm.put(k5, v5);
        lhm.put(k6, v6);
        lhm.put(k7, v7);
        lhm.put(k8, v8);
        lhm.put(k9, v9);
        lhm.put(k10, v10);
        return lhm;
    }

    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <K, V> LinkedHashMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entries) {
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>();
        for (var entry: entries) {
            lhm.put(entry.getKey(), entry.getValue());
        }
        return lhm;
    }
}
