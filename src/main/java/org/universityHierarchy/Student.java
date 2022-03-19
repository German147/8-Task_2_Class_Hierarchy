package org.universityHierarchy;

import java.util.Scanner;

public class Student extends People {

    private int student_id;
    private double majorQualification;
    private double lowQualification;

    public Student() {
    }

    public double getGradePointAverage() {
        double averagePoints = 0;
        return averagePoints;

    }

    public int getExamsTotalQualifications() {
        int totalQualifications = 0;
        return totalQualifications;
    }

    public int getExamsNumber() {
        int examsNumber = 0;
        return examsNumber;
    }

    public void addStudentInformation() {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();

        System.out.println("Enter the following student's data: ");
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        student1.setUserName(name);
        System.out.println("Enter your surname");
        String surname = scanner.nextLine();
        student1.setSurname(surname);
        System.out.println("Enter your phone number");
        String phone = scanner.nextLine();
        student1.setPhoneNumber(phone);
        System.out.println("Enter your neighborhood");
        String neighborhood = scanner.nextLine();
        student1.setNeighborhoodName(neighborhood);
        System.out.println("Enter the state you live");
        String state = scanner.nextLine();
        student1.setStateName(state);
        System.out.println("Enter country name");
        String country = scanner.nextLine();
        student1.setCountryName(country);
    }

}
