package org.universityHierarchy.service;

import Lambda_Interfaces.ICreateExams;
import Lambda_Interfaces.IPrintExams;


public interface ITeacher {

    ICreateExams examsCreated();

    IPrintExams printExams(ICreateExams examsLists);
}

