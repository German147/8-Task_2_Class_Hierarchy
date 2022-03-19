package org.universityHierarchy;

import java.util.Scanner;

public class Teacher extends TeacherInformation {

    private static final Scanner scanner = new Scanner(System.in);
    private String department;
    private String[] teacherClasses;

    public Teacher() {

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
        Teacher teacher1 = new Teacher();

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
    public void createClasses() {
        System.out.println("Enter the number of topics of a lecture: ");
        int topicsNumber = scanner.nextInt();
    }

    @Override
    public void createExams() {
        System.out.println("Create your Exam");
    }

    @Override
    public void takeAssistance() {
        System.out.println("Teacher takes assistance");
    }

    @Override
    public void createYearlyPlanningTopics() {
        System.out.println("Teacher creates the yearly planning topics ");
    }

}
