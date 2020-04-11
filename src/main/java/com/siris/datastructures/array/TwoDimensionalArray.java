package com.siris.datastructures.array;

public class TwoDimensionalArray {
    int arr[][] = null;

    public TwoDimensionalArray(int rows, int cols) {
        this.arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValue(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
            } else {
                System.out.println("index is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("index is out of bound. can't insert");
        }
    }

    public void fetchValueAtIndex(int row, int col) {
        try {
            System.out.println(arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("indexes shared are out of bound.");
        }
    }

    public void searchValue(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("value " + arr[row][col] + " found at index: (" + row +", " + col + ")");
                    return;
                }
            }
        }
        System.out.println("value not found.");
    }

    public void traverseArray() {
        if (arr == null) {
            System.out.println("array doesn't exist");
            return;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.println(arr[row][col]);
            }
        }
    }

    public void deleteValueFromIndex(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("given indexes out of bound. not action taken.");
        }
    }

    public void deleteArray() {
        arr = null;
        System.out.println("array deleted.");
    }
}
