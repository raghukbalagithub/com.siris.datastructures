package com.siris.javaconcepts.collections;

public class IteratorDemo {
    public static void main (String args[]) {
        GenericListWithIterator<Integer> gli = new GenericListWithIterator();

        gli.add(1);
        gli.add(2);
        gli.add(3);

        for(int item : gli) {
            System.out.println(item);
        }
    }
}
