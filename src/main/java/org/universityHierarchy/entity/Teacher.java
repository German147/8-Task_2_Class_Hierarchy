package org.universityHierarchy.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.exceptions.StudentNotSetInformation;

import java.util.Scanner;

public class Teacher extends TeacherInformation {

    private static final Logger LOGGER = LogManager.getLogger(Teacher.class);
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
        Teacher teacher1 = new Teacher();
        //I implement this try with resource in order to get ths scanner closed at the end of this execution
        try (Scanner scanner = new Scanner(System.in)) {
            LOGGER.info("Enter the following teacher's data: ");
            LOGGER.info("Enter the following student's data: ");
            LOGGER.info("Enter your name");
            String name = scanner.nextLine();
            teacher1.setName(name);
            LOGGER.info("Enter your surname");
            String surname = scanner.nextLine();
            teacher1.setSurname(surname);
            LOGGER.info("Enter your phone number");
            String phone = scanner.nextLine();
            teacher1.setPhoneNumber(phone);
            LOGGER.info("Enter your neighborhood");
            String neighborhood = scanner.nextLine();
            teacher1.setNeighborhoodName(neighborhood);
            LOGGER.info("Enter the state you live");
            String state = scanner.nextLine();
            teacher1.setStateName(state);
            LOGGER.info("Enter country name");
            String country = scanner.nextLine();
            teacher1.setCountryName(country);
            LOGGER.info("All teacher information was set");
        } catch (RuntimeException ex) {
            throw new StudentNotSetInformation("The student information was not set");
        }
    }

    public int gettingPositionTeacher() {
        LOGGER.info("Enter your teacher situation:" +
                "Hit 1 if you are a permanent Teacher and hit 2 if you are a " +
                "transitional teacher");
        int positionTeacher = scanner.nextInt();
        return positionTeacher;
    }

    @Override
    public void createClasses() {
        LOGGER.info("Enter the number of topics of a lecture: ");
        int topicsNumber = scanner.nextInt();
    }

    @Override
    public void createExams() {

    }

    @Override
    public void takeAssistance() {

    }

    @Override
    public void createYearlyPlanningTopics() {

    }

    @Override
    public void addSubject() {

    }

}
