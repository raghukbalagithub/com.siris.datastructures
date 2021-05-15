package com.siris.javaconcepts.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InterfaceDemos {
    public static void main(String arg[]) {

        Level0Interface l0i = new ChildClass();
        Level1Interface l1i = new ChildClass();

        ChildClass cc = (ChildClass)l0i;

        ChildClass cc1 = new ChildClass();

        List<String> collection = new ArrayList<String>();
        ArrayList<String> alist = new ArrayList<String>();
    }
}
