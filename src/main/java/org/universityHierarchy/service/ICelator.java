package org.universityHierarchy.service;

import Lambda_Interfaces.ICreateExamsQualifications;
import Lambda_Interfaces.ICreateSomething;
import org.universityHierarchy.entity.People;

import java.util.List;

public interface ICelator {

    ICreateSomething<List<People>> createStudentList();

    ICreateExamsQualifications studentsQualifications();

    ICreateExamsQualifications printExamsAndQualifications(ICreateExamsQualifications examsAndQualifications);

    ICreateSomething printStudentList(ICreateSomething<List<People>> listOfStudents);
}
