package org.universityHierarchy.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Collections {

    private static Integer notes[];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("How many notes are there?");
        notes = new Integer[scanner.nextInt()];
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Enter the grades: " + (i + 1));
            notes[i] = scanner.nextInt();
        }

//        for (int i = 0; i < notes.length; i++) {
//            System.out.print(notes[i] + " | ");
//        }
        Arrays.sort(notes);
        Collection<Integer> nuevasNotas = new ArrayList<Integer>();
        nuevasNotas.addAll(Arrays.asList(notes));

        System.out.println(nuevasNotas);

        var i = nuevasNotas.iterator();
        while (i.hasNext()) {

//
//        }
//            System.out.print(i.next()+ " |");
//        }


        }
    }
}


//        Collection<Integer> c = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++)
//            c.add(i);
//        c.// Autoboxing
//        for (Integer i : c)
//            System.out.print(i + ", ");



