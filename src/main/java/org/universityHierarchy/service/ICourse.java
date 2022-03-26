package org.universityHierarchy.service;

public interface ICourse {

    int WORKSHOP_LENGTH = 5;

    String[] createWorkshop();

    String[] addSubjectToCourse();

    void printWorkshop(String workshop[]);

   void printSubjects(String subjects[]);

    String[] addStudentToCourse();

    void printStudents(String students[]);

    String[] addTeachers();

    void printTeachers(String teachers[]);


}
