package org.universityHierarchy.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.exceptions.AddStudentToCourseException;
import org.universityHierarchy.exceptions.AddSubjectException;
import org.universityHierarchy.exceptions.CreateWorkShopException;
import org.universityHierarchy.service.IStudent;
import org.universityHierarchy.service.ISubject;

import java.util.Date;
import java.util.Scanner;

public class Course extends CourseInformation implements ISubject, IStudent {

    private static final Logger LOGGER = LogManager.getLogger(Course.class);
    private String courseName;
    private String courseDay;
    private Date courseTime;

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDay() {
        return courseDay;
    }

    public void setCourseDay(String courseDay) {
        this.courseDay = courseDay;
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }

    @Override
    public String[] addStudentToCourse() {
        String[] students = new String[STUDENT_LENGTH];
        try (Scanner scanner = new Scanner(System.in)){
            for (int i = 0; i < students.length; i++) {
                LOGGER.info("Enter the students, please. " + (i + 1));
                students[i] = scanner.nextLine();
            }
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new AddStudentToCourseException("The student could not be loaded" + e);
        }
        return students;
    }

    @Override
    public void printStudents(String[] students) {
        for (int i = 0; i < STUDENT_LENGTH; i++) {
            LOGGER.info(students[i]);
        }
    }

    @Override
    public String[] addSubjectToCourse() {
        String[] subjects = new String[SUBJECTS_LENGTH];
        try(Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < subjects.length; i++) {
                LOGGER.info("Enter the subjects, please. " + (i + 1));
                subjects[i] = scanner.nextLine();
            }
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new AddSubjectException("The subject could not be loaded");

        }
        return subjects;
    }

    @Override
    public void printSubjects(String subjects[]) {
        for (int i = 0; i < SUBJECTS_LENGTH; i++) {
            LOGGER.info(subjects[i] + " | ");
        }
    }

    @Override
    public void printWorkshop(String[] workshop) {
        for (int i = 0; i < workshop.length; i++) {
            LOGGER.info(workshop[i] + " | ");
        }
    }

    @Override
    public String[] createWorkshop() {
        String[] workshop = new String[WORKSHOP_LENGTH];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < WORKSHOP_LENGTH; i++) {
                LOGGER.info("Enter the new workshop, please");
                workshop[i] = scanner.nextLine();
            }
        } catch (RuntimeException e) {
            LOGGER.error(e);
            throw new CreateWorkShopException("The WorkShop could not be created");
        }
        return workshop;
    }
}
