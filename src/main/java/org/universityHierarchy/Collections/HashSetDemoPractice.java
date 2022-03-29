package org.universityHierarchy.Collections;

import java.util.HashSet;

public class HashSetDemoPractice {
    public static void main(String[] args) {
        // Create a hash set.
        HashSet<String> miHashSet = new HashSet<String>();
// Add elements to the hash set.
        miHashSet.add("Barco");
        miHashSet.add("Aanimal");
        miHashSet.add("Dedo");
        miHashSet.add("Estancia");
        miHashSet.add("Casa");
        miHashSet.add("Fruta");
        System.out.println(miHashSet.size());
        System.out.println(miHashSet.clone());
        System.out.println(miHashSet);


    }
}
