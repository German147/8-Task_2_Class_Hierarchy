package org.universityHierarchy.service;

import Lambda_Interfaces.ICreateExamsQualifications;

public interface ICelator {

    ICreateExamsQualifications studentsQualifications();

    ICreateExamsQualifications printExamsAndQualifications(ICreateExamsQualifications examsAndQualifications);
}
