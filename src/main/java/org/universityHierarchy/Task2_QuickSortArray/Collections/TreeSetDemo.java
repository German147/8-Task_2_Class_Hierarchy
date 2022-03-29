package org.universityHierarchy.Task2_QuickSortArray.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a tree set.
        TreeSet<String> miTreeSet = new TreeSet<String>();
// Add elements to the tree set.
        miTreeSet.add("Ccasa");
        miTreeSet.add("Amaca");
        miTreeSet.add("Barco");
        miTreeSet.add("Elephant");
        miTreeSet.add("Foca");
        miTreeSet.add("Dedo");

        Iterator<String> miIterator = miTreeSet.iterator();
        while (miIterator.hasNext()){
            String cosas = miIterator.next();
            System.out.print(cosas + "  ");

        }
        System.out.println("\n");


    }
}
