package org.universityHierarchy;

import java.util.Scanner;

public class UserInteractionClass extends People {

    private String userName;
    private int userCategory;

    public UserInteractionClass() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(int userCategory) {
        this.userCategory = userCategory;
    }

    public String greeting() {
        System.out.println("Please, enter your name to start navigating through our University");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;

    }

    public void welcomeUser(String name) {
        System.out.println("Hi, welcome to our University " + name);
    }

    public int chooseCategoryUser() {
        System.out.println("Now,if you want to enter as a Student hit 1," +
                "as a Teacher hit 2, or as an Employee hit 3");
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
}
