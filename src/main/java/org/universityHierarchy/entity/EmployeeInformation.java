package org.universityHierarchy.entity;

import org.universityHierarchy.entity.People;
import org.universityHierarchy.service.IEmployee;

public abstract class EmployeeInformation extends People implements IEmployee {

    abstract void addEmployeeInformation();

}
