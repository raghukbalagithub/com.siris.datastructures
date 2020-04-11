package com.siris.datastructures.array;

public class SingleDimensionalArrayTests {

    public static void main(String args[]) {
        System.out.println("Creating a blank array of size 10...");
        SingleDimensionalArray sda = new SingleDimensionalArray(10);

        System.out.println("Printing the Array...");
        sda.traverseArray();
        System.out.println();System.out.println();

        System.out.println("Inserting few values in the array...");
        sda.insertValue(0,0);
        sda.insertValue(1,10);
        sda.insertValue(2,20);
        sda.insertValue(3,30);
        sda.insertValue(4,40);
        sda.insertValue(5,50);
        sda.insertValue(6,60);
        sda.insertValue(7,70);
        sda.insertValue(8,80);
        sda.insertValue(1,100);
        sda.insertValue(12,120);
        System.out.println();System.out.println();

        System.out.println("Printing the Array...");
        sda.traverseArray();
        System.out.println();System.out.println();

        System.out.println("Accessing cell number#1...");
        sda.fetchValueAtIndex(1);
        System.out.println();System.out.println();


        System.out.println("Accessing cell number#5...");
        sda.fetchValueAtIndex(5);
        System.out.println();System.out.println();

        System.out.println("Accessing cell number#15...");
        sda.fetchValueAtIndex(15);
        System.out.println();System.out.println();

        System.out.println("Searching 30 in the array...");
        sda.searchValue(30);
        System.out.println();System.out.println();


        System.out.println("Searching 400 in the array...");
        sda.searchValue(400);
        System.out.println();System.out.println();

        System.out.println("Deleting value from Cell#3 of array...");
        System.out.println("Before Deleting: ");
        sda.traverseArray();
        sda.deleteValueFromIndex(3);
        System.out.println();
        System.out.println("After Deleting: ");
        sda.traverseArray();
        System.out.println();System.out.println();System.out.println();

        System.out.println("Deleting value from Cell#15 of array...");
        System.out.println("Before Deleting: ");
        sda.traverseArray();
        sda.deleteValueFromIndex(15);
        System.out.println("After Deleting: ");
        sda.traverseArray();
        System.out.println();System.out.println();System.out.println();

        sda.deleteArray();
        System.out.println("After Deleting: ");
        sda.traverseArray();
    }
}
