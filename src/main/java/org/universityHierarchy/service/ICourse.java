package org.universityHierarchy.service;

import Lambda_Interfaces.ICreateSomething;

import java.util.LinkedList;

public interface ICourse {

    int WORKSHOP_LENGTH = 3;

    ICreateSomething createWorkShop();

    LinkedList<String> createWorkshop();

    String[] addStudentToCourse();

    LinkedList<String> createTeacherList();

    ICreateSomething<LinkedList<String>> printWorkshop(ICreateSomething<LinkedList<String>> uniWorkShops);

    void printWorkshop(LinkedList<String> workshop);

    void printStudents(String[] students);

    void printTeachers(LinkedList<String> teacherList);
}
