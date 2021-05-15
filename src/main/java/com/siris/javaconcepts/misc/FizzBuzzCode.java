package com.siris.javaconcepts.misc;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FizzBuzzCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("number: ");
        int x = sc.nextInt();

        if (((x % 5) == 0) && ((x % 3) == 0)) {
            System.out.println("FIZZ  BUZZ");
        } else if (x % 5 == 0) {
            System.out.println("FIZZ");
        } else if (x % 3 == 0) {
            System.out.println("BUZZ");
        } else
            System.out.println(x);

        char  a = 'A';
        int a_value = (int)a;

        System.out.println(a_value);
    }


}
