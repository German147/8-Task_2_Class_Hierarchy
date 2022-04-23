package org.universityHierarchy.service;

import org.universityHierarchy.Homework_Lambda_Interfaces.ICreateExams;
import org.universityHierarchy.Homework_Lambda_Interfaces.IPrintExams;


public interface ITeacher {

    ICreateExams examsCreated();

    IPrintExams printExams(ICreateExams examsLists);
}

