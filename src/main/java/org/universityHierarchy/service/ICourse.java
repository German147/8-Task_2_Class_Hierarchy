package org.universityHierarchy.service;

import org.universityHierarchy.Lambda_Interfaces.ICreateSomething;

import java.util.LinkedList;

public interface ICourse {

    int WORKSHOP_LENGTH = 3;

    ICreateSomething createWorkShop();

    ICreateSomething<LinkedList<String>> createTeacherList();

    ICreateSomething<LinkedList<String>> printWorkshop(ICreateSomething<LinkedList<String>> uniWorkShops);

    ICreateSomething<LinkedList<String>> printTeachers(ICreateSomething<LinkedList<String>> teacherList);
}
