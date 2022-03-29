package org.universityHierarchy.Collections;

import java.util.*;

public class PrintingContainers {



    //Esto no funciona hoy en dia, antes se colocaban de esta forma
//    public static class PrintContainers {
//        Collection<String> fillCollection(Collection<String> collection) {
//            collection.add("rat");
//            collection.add("cat");
//            collection.add("dog");
//            collection.add("dog");
//            return collection;
//        }
//    }

    private static ArrayList<String> fillCollection(ArrayList<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fillMap(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "scratch");
        map.put("birth", "twit");
        map.put("dog", "barck");
        return map;
    }


    public static void main(String[] args) {

        System.out.println(fillCollection(new ArrayList<String>()));
        System.out.println(fillMap(new HashMap<String, String>()));
        System.out.println(fillMap(new TreeMap<String, String>()));
        System.out.println(fillMap(new LinkedHashMap<String, String>()));
    }

}
