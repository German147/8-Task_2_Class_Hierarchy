package org.universityHierarchy.service;

import org.universityHierarchy.Lambda_Interfaces.ICreateSomething;

import java.util.LinkedList;
import java.util.List;

public interface ICourse {

    int WORKSHOP_LENGTH = 3;

    ICreateSomething createWorkShop();

    ICreateSomething<LinkedList<String>> createTeacherList();

    ICreateSomething<List<String>> printWorkshop(ICreateSomething<List<String>> uniWorkShops);

    ICreateSomething<LinkedList<String>> printTeachers(ICreateSomething<LinkedList<String>> teacherList);
}
