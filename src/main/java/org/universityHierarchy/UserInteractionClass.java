package org.universityHierarchy;

import java.util.Scanner;

public class UserInteractionClass extends People{
    private String name;
    private int categoryUser;

    public UserInteractionClass(String name) {
        this.name = name;
    }

    public UserInteractionClass() {
    }

    public UserInteractionClass(String name, int categoryUser) {
        this.name = name;
        this.categoryUser = categoryUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryUser() {
        return categoryUser;
    }

    public void setCategoryUser(int categoryUser) {
        this.categoryUser = categoryUser;
    }

    public String greeting() {
        System.out.println("Please, enter your name to start navigating throw our University");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;

    }

    public void welcomeUser(String name) {
        System.out.println("Hi, welcome to our University " + name);
    }

    public int chooseCategoryUser() {
        System.out.println("Now,if you want to enter as a Student hit 1," +
                "as a Teacher hit 2, and as an Employee hit 3");
        Scanner scanner = new Scanner(System.in);
        int category = scanner.nextInt();
        return category;
    }

    public void chosenCategory(int category) {
        switch (category) {
            case 1:
                System.out.println("As a student you can: \n" +
                        "Set your Information \n " +
                        " Get your average point \n" +
                        " Get your highest qualification \n" +
                        " Get the lowest qualification \n" +
                        " Set the amount of taken exams ");
                break;
            case 2:
                System.out.println("As a teacher you can:" +
                        "Add classes \n" +
                        "Create exams \n" +
                        "Calculate payment");
                break;
            case 3:
                System.out.println("Or a Staff Employee you can " +
                        "See your Information \n" +
                        "Calculate pay \n");
        }

    }

    public boolean addStudentInformation(int option) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        if (option == 1) {
            System.out.println("Enter the following student's data: ");
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            student1.setName(name);
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
        return true;
    }

    public boolean addTeacherInformation(int option) {
        Scanner scanner = new Scanner(System.in);
        UniversityTeacher teacher1 = new UniversityTeacher();
        if (option == 2) {
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
        return true;
    }

    public boolean addEmployeeInformation(int option) {

        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();

        if (option == 3) {
            System.out.println("Enter the following employee's data: ");
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            employee1.setName(name);
            System.out.println("Enter your surname");
            String surname = scanner.nextLine();
            employee1.setSurname(surname);
            System.out.println("Enter your phone number");
            String phone = scanner.nextLine();
            employee1.setPhoneNumber(phone);
            System.out.println("Enter your neighborhood");
            String neighborhood = scanner.nextLine();
            employee1.setNeighborhoodName(neighborhood);
            System.out.println("Enter the state you live");
            String state = scanner.nextLine();
            employee1.setStateName(state);
            System.out.println("Enter country name");
            String country = scanner.nextLine();
            employee1.setCountryName(country);
        }
        return true;
    }


    @Override
    public String toString() {
        return "UserInteractionClass{" +
                "name='" + name + '\'' +
                ", categoryUser='" + categoryUser + '\'' +
                '}';
    }
}
