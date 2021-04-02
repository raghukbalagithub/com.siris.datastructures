package com.siris.datastructures.array;

public class PrintSortedOrderFrom2SortedArrays {

    public void merging(int arr1[], int arr2[], int n, int m) {

        int i, j;
        i = j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else if (arr1[i] == arr2[j]) {
                System.out.print(arr2[j] + " " + arr1[i] + " ");
                i++;
                j++;
            }
        }

        if (i < arr1.length) {
            while (i < arr1.length) {
                System.out.print(arr1[i] + " ");
                i++;
            }
        }

        if (j < arr2.length) {
            while (j < arr2.length) {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
    }

    public static void main (String[] args){
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};

        PrintSortedOrderFrom2SortedArrays obj = new PrintSortedOrderFrom2SortedArrays();
        obj.merging(arr1, arr2, 4, 5);
    }
}
