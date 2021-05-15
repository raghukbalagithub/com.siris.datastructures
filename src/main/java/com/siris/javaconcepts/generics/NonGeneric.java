package com.siris.javaconcepts.generics;

public class NonGeneric {

    //single type of parameter method
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second)  < 0) ? second : first;
    }

    //multiple types of parameters method
    public static <K, V> K print(K key, V value) {
        return (K)(key + " = " + value);
    }
}
