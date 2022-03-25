package org.universityHierarchy.service;

public interface ICourse {

    int WORKSHOP_LENGTH = 5;

    String[] createWorkshop();

    void printWorkshop(String workshop[]);

    String[] addSubjectToCourse();

   void printSubjects(String subjects[]);

    String[] addStudentToCourse();

    void printStudents(String students[]);

    String[] addTeachers();

    void printTeachers(String teachers[]);


}
