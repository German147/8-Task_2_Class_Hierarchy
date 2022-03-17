package org.universityHierarchy;

public class StaffEmployee extends Employee {

    private String staffAreaName;

    public StaffEmployee() {

    }

    public StaffEmployee(String staffAreaName) {
        this.staffAreaName = staffAreaName;
    }

    public String getStaffAreaName() {
        return staffAreaName;
    }

    public void setStaffAreaName(String staffAreaName) {
        this.staffAreaName = staffAreaName;
    }
}
