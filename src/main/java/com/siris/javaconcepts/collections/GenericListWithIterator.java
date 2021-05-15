package com.siris.javaconcepts.collections;

import com.siris.javaconcepts.generics.GenericList;

import java.util.Iterator;

public class GenericListWithIterator<T>  implements Iterable<T> {
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

    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private GenericListWithIterator<T> list;
        private int index;

        public ListIterator(GenericListWithIterator<T> list) {
            this.list = list;
        }

        public boolean hasNext() {
            return (index < list.getCount());
        }

        public T next() {
            return list.getValue(index++);
        }

        public void remove() {

        }
    }
}
