package org.universityHierarchy;

public class Employee extends People {

    private int payScale;

    public Employee() {
    }

    public Employee(int payScale) {
        this.payScale = payScale;
    }

    public Employee(String name, String surname,
                    String phoneNumber, int payScale) {
        super(name, surname, phoneNumber);
        this.payScale = payScale;
    }

    public int getPayScale() {
        return payScale;
    }

    public void setPayScale(int payScale) {
        this.payScale = payScale;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "payScale=" + payScale +
                '}';
    }
}
