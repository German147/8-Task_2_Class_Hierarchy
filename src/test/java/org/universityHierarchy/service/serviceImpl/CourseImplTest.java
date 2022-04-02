package org.universityHierarchy.service.serviceImpl;

import org.junit.jupiter.api.Assertions;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class CourseImplTest {


    @org.junit.jupiter.api.Test
    void createSubjects() {
        Set<String> subjects = new HashSet<>();
        //given
        String subject1 = "Maths";
        String subject2 = "PE";
        String subject3 = "History";

        //when
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);

        Set<String> result = subjects;
        //then
        Set<String> expected = new HashSet<>(Arrays.asList("Maths", "PE", "History"));

        Assertions.assertEquals(result, expected);

    }

    @org.junit.jupiter.api.Test
    void printSubjects() {
    }

    @org.junit.jupiter.api.Test
    void addSubjectToCourse() {
    }

    @org.junit.jupiter.api.Test
    void testPrintSubjects() {
    }

    @org.junit.jupiter.api.Test
    void createWorkshop() {
    }

    @org.junit.jupiter.api.Test
    void printWorkshop() {
    }

    @org.junit.jupiter.api.Test
    void addStudentToCourse() {
    }

    @org.junit.jupiter.api.Test
    void printStudents() {
    }

    @org.junit.jupiter.api.Test
    void addTeachers() {
    }

    @org.junit.jupiter.api.Test
    void printTeachers() {
    }
}