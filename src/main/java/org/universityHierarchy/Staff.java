package org.universityHierarchy;

public class Staff extends Employee {

    private String staffName;

    public Staff() {

    }

    public Staff(String staffName) {
        this.staffName = staffName;
    }

    public Staff(int payScale, String staffName) {
        super(payScale);
        this.staffName = staffName;
    }

    public Staff(String name, String surname,
                 String phoneNumber, int payScale,
                 String staffName) {
        super(name, surname, phoneNumber, payScale);
        this.staffName = staffName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public void showInfoUniversityStaff(String name, String surname,
                                        String phoneNumber,double monthlyPay,
                                        int ratePay, String staffName){

    }
    public void calculateStaffPay(){

    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffName='" + staffName + '\'' +
                '}';
    }
}
