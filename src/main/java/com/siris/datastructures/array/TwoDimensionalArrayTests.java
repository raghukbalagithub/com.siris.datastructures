package com.siris.datastructures.array;

public class TwoDimensionalArrayTests {
    public static void main(String[] args) {

        System.out.println("Creating a blank array of size 5X5...");
        TwoDimensionalArray sda = new TwoDimensionalArray(5,5);
        sda.traverseArray();
        System.out.println();System.out.println();System.out.println();

        sda.insertValue(0,2,1000000001);
        sda.traverseArray();
        System.out.println();System.out.println();System.out.println();

        sda.insertValue(0,2,1000000001);
        sda.traverseArray();
        System.out.println();System.out.println();System.out.println();

        sda.fetchValueAtIndex(0,2);
        sda.fetchValueAtIndex(6,2);
        sda.fetchValueAtIndex(2,2);
        System.out.println();System.out.println();System.out.println();

        sda.searchValue(10);
        System.out.println();
        sda.searchValue(-2147483648);
        System.out.println();
        sda.searchValue(1000000001);
        System.out.println();System.out.println();System.out.println();


        sda.deleteValueFromIndex(0,2);
        System.out.println();
        sda.traverseArray();
        System.out.println();System.out.println();System.out.println();


        sda.deleteArray();
        System.out.println();
        sda.traverseArray();
        System.out.println();System.out.println();System.out.println();
    }
}
