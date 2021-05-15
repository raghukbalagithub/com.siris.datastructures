package com.siris.javaconcepts.interfaces;

public class ChildClass implements Level1Interface {

    public void doLevel1Interface1a() {
        System.out.println("doLevel1Interface1a");
    }

    public void doLevel1Interface1b() {
        System.out.println("doLevel1Interface1b");
    }

    public void doLevel0Interface1a() {
        System.out.println("doLevel0Interface1a");
    }

    public void doLevel0Interface1b() {
        System.out.println("doLevel0Interface1b");
    }

    public void childClass0() {
        System.out.println("childClass0");
    }

    public void childClass1() {
        System.out.println("childClass1");
    }
}
