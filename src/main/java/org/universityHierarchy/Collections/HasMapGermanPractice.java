package org.universityHierarchy.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class HasMapGermanPractice {
    public static void main(String[] args) {
        studentsQualifications();
    }

    static HashMap<String, Integer> studentsQualifications() {
        HashMap<String, Integer> studentsQualifications = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine();
        while (studentNumber-- > 0) {
            System.out.println("Enter the name of the student: ");
            String name = scanner.nextLine();
            name = name.trim();
            System.out.println("Now enter the qualification, please: ");
            int contact = scanner.nextInt();
            scanner.nextLine();
            studentsQualifications.put(name, contact);
        }
        System.out.println(studentsQualifications);

        // obj.nextLine();

        String search = scanner.nextLine();
        if (studentsQualifications.containsKey(search)) {
            Integer a = studentsQualifications.get(search);
            System.out.println(search + "=" + a);
        } else {
            System.out.println("Not Found");
        }
        return studentsQualifications;
    }
}

