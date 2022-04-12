package service;

import java.util.LinkedList;

public interface ICourse {

    int WORKSHOP_LENGTH = 3;

    LinkedList<String> createWorkshop();

    String[] addStudentToCourse();

    LinkedList<String> createTeacherList();

    void printWorkshop(LinkedList<String> workshop);

    void printStudents(String[] students);

    void printTeachers(LinkedList<String> teacherList);
}
