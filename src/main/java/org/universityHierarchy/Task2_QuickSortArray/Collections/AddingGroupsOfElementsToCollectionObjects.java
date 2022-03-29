package org.universityHierarchy.Task2_QuickSortArray.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AddingGroupsOfElementsToCollectionObjects {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<Integer>();
//Arrays.asList(1, 2, 3, 4, 5)
        Integer[] moreInts = {6, 7, 8, 9, 10,11};


// Runs significantly faster, but you can’t
// construct a Collection this way:
//        Collections.addAll(collection, 11, 12, 13, 14, 15)
//        Collections.addAll(collection, moreInts);
// Produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element
// list.add(21); // Runtime error because the
// underlying array cannot be resized.

        collection.addAll(Arrays.asList(moreInts));

        System.out.println("Here we see the moreInts Integer array from 6 to 10");
        for (int i = 0; i < moreInts.length; i++) {
            System.out.print(moreInts[i] + " |");
        }
        System.out.println("-------------------------");
        System.out.println("Here we only see the list printed with numbers from 16 to 20 it is between brackets");
        System.out.println(list);

        System.out.println("Her we see the collection from 1 to 5 but in it was added the rest of the numbers  ");
        System.out.println(collection);
    }
}
