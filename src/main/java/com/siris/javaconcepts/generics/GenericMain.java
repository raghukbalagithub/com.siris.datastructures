package com.siris.javaconcepts.generics;

public class GenericMain {
    public static void main(String args[]) {

        //testing generic classes
        GenericList general = new GenericList<Integer>();
        general.add(1);
        general.add(2);

        System.out.println("count: " + general.getCount());
        System.out.println(general.getValue(1));

        //another way of declaring
        GenericList<Float> general1 = new GenericList();
        general1.add(1.1F);
        general1.add(2.3F);

        System.out.println("count: " + general1.getCount());
        System.out.println(general1.getValue(0));


        //testing generic method
        System.out.println("Max is: " + NonGeneric.max(1, 3));

        System.out.println("Max user points: " + NonGeneric.max(new User(30), new User(20)));

        //testing generic method with different type parameters
        System.out.println(NonGeneric.print("xyz", 2));
    }
}
