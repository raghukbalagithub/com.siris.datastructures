package com.siris.datastructures.array;

public class SingleDimensionalArray {

    int arr[] = null;

    public SingleDimensionalArray(int size) {
        this.arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insertValue(int index, int value) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
            } else {
                System.out.println("index is occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("index is out of bound.");
        }
    }

    public void traverseArray() {
        if (arr == null) {
            System.out.println("array doesn't exists.");
            return;
        }
        System.out.println("traversing the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void fetchValueAtIndex(int index) {
        try
        {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("index is out of bound. can't fetch any value.");
        }
    }

    public void searchValue(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == valueToSearch) {
                System.out.println("value found at index: " + i);
                return;
            }
        }
        System.out.println("value not found.");
    }

    public void deleteValueFromIndex(int valueFromIndex) {
        try {
            arr[valueFromIndex] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("index is out of bound. not action taken.");
        }
    }

    public void deleteArray() {
        arr = null;
        System.out.println("array has been successfully deleted.");

    }
}
