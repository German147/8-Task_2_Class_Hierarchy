package org.universityHierarchy.Task2_QuickSortArray.Collections;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        // Create an array list.
        ArrayList<Integer> nuevoArrayDeInt = new ArrayList<Integer>();
// Add elements to the array list.
        nuevoArrayDeInt.add(1);
        nuevoArrayDeInt.add(2);
        nuevoArrayDeInt.add(3);
        nuevoArrayDeInt.add(4);
        System.out.println("Contents of nuevoArrayDeInt: " + nuevoArrayDeInt + "\n");
        nuevoArrayDeInt.remove(2);
        System.out.println("Now number three has gone " + nuevoArrayDeInt + "\n");
        nuevoArrayDeInt.add(2,8);
        System.out.println("Now instead number 3  there is an 8 " + nuevoArrayDeInt + "\n");
        System.out.println("Here we change to simple array and then sum it up");
// Get the array.
        Integer arraySimple[] = new Integer[nuevoArrayDeInt.size()];
        arraySimple = nuevoArrayDeInt.toArray(arraySimple);
        int sum = 0;
// Sum the array.
        for (int i : arraySimple) sum += i;
        System.out.println("Sum is: " + sum);
    }
}
