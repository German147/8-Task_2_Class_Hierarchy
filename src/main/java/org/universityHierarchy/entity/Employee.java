package org.universityHierarchy.entity;


import java.util.Objects;

public class Employee extends People{


    private int employee_Id;

    public Employee() {
    }

    public int getEmployee_Id() {
        return employee_Id;
    }

    public void setEmployee_Id(int employee_Id) {
        this.employee_Id = employee_Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployee_Id() == employee.getEmployee_Id();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee_Id());
    }
}
