package com.siris.javaconcepts.generics;

public class GenericList<T> {
    private T[] list = (T[]) new Object[10];
    int count;

    public void add(T t) {
        list[count++] = t;
    }

    public T getValue(int index) {
        return list[index];
    }

    public int getCount() {
        return count;
    }
}
