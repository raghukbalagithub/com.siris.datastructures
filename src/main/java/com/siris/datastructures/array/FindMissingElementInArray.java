package com.siris.datastructures.array;

import java.util.*;
import java.lang.*;
import java.io.*;

public class FindMissingElementInArray {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("test cases = " +t);

        for(int ucase = 0; ucase < t; ucase++) {
            int limit = sc.nextInt();
            int arr[] = new int[limit-1];

            for (int i = 0; i < limit - 1; i++) {
                arr[i] = sc.nextInt();
            }

            FindMissingElementInArray fmea = new FindMissingElementInArray();
            fmea.findMissingNumber(arr, limit);
        }
    }

    public void findMissingNumber(int arr[], int limit) {
        int currExpected = 1;
        int refArray[] = new int[limit+1];

        for(int i = 0; i<arr.length; i++) {
            refArray[arr[i]] = -1;
        }

        for(int i=1; i<refArray.length; i++) {
            if(refArray[i] != -1) {
                System.out.println(i);
                break;
            }
        }
    }
}
