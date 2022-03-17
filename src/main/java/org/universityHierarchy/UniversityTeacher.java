package org.universityHierarchy;

import java.util.Arrays;
import java.util.Scanner;

public class UniversityTeacher extends Employee {

    private static Scanner scanner = new Scanner(System.in);
    private String department;
    private String[] teacherClasses;

    public UniversityTeacher() {

    }

    public UniversityTeacher(String department,
                             String[] teacherClasses) {
        this.department = department;
        this.teacherClasses = teacherClasses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getTeacherClasses() {
        return teacherClasses;
    }

    public void setTeacherClasses(String[] teacherClasses) {
        this.teacherClasses = teacherClasses;
    }

    public void addTeacherInformation() {
        Scanner scanner = new Scanner(System.in);
        UniversityTeacher teacher1 = new UniversityTeacher();

        System.out.println("Enter the following teacher's data: ");
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        teacher1.setName(name);
        System.out.println("Enter your surname");
        String surname = scanner.nextLine();
        teacher1.setSurname(surname);
        System.out.println("Enter your phone number");
        String phone = scanner.nextLine();
        teacher1.setPhoneNumber(phone);
        System.out.println("Enter your neighborhood");
        String neighborhood = scanner.nextLine();
        teacher1.setNeighborhoodName(neighborhood);
        System.out.println("Enter the state you live");
        String state = scanner.nextLine();
        teacher1.setStateName(state);
        System.out.println("Enter country name");
        String country = scanner.nextLine();
        teacher1.setCountryName(country);

    }

    public int gettingPositionTeacher() {
        System.out.println("Enter your teacher situation:" +
                "Hit 1 if you are a permanent Teacher and hit 2 if you are a " +
                "transitional teacher");
        int positionTeacher = scanner.nextInt();
        return positionTeacher;
    }

    @Override
    public String toString() {
        return "UniversityTeacher{" +
                "department='" + department + '\'' +
                ", teacherClasses=" + Arrays.toString(teacherClasses) +
                '}';
    }
}
