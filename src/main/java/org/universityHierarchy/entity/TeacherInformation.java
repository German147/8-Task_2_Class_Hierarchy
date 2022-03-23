package org.universityHierarchy.entity;

import org.universityHierarchy.entity.People;
import org.universityHierarchy.service.ITeacher;

public abstract class TeacherInformation extends People implements ITeacher {

    public abstract void addTeacherInformation();

}
