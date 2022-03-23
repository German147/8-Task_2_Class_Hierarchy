package org.universityHierarchy.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Student extends People {

    private static final Logger LOGGER = LogManager.getLogger(Student.class);
    private int student_id;
    private double majorQualification;
    private double lowQualification;

    public Student() {
    }

    public Student(int student_id, double majorQualification, double lowQualification) {
        this.student_id = student_id;
        this.majorQualification = majorQualification;
        this.lowQualification = lowQualification;
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
        LOGGER.info("Enter the following student's data: ");
        LOGGER.info("Enter your name");
        String name = scanner.nextLine();
        student1.setName(name);
        LOGGER.info("Enter your surname");
        String surname = scanner.nextLine();
        student1.setSurname(surname);
        LOGGER.info("Enter your phone number");
        String phone = scanner.nextLine();
        student1.setPhoneNumber(phone);
        LOGGER.info("Enter your neighborhood");
        String neighborhood = scanner.nextLine();
        student1.setNeighborhoodName(neighborhood);
        LOGGER.info("Enter the state you live");
        String state = scanner.nextLine();
        student1.setStateName(state);
        LOGGER.info("Enter country name");
        String country = scanner.nextLine();
        student1.setCountryName(country);
        LOGGER.info("All Student information was set");
    }

}
