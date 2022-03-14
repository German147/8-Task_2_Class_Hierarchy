package org.universityHierarchy;

public class People extends Neighborhood{

    private String name;
    private String surname;
    private String phoneNumber;
    private double monthlyPay;
    private int payRate;

    public People() {
    }

    public People(String name,
                  String surname,
                  String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateName() {
        return name;
    }

    public void setStateName(String stateName) {
        this.name = stateName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
    public void showInfoPeople(String name,
                               String surname,
                               String phoneNumber){


    }
    public double calculatePayRate(){
        return payRate;
    }

    public double calculateMonthlyPay(){
        return monthlyPay;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", monthlyPay=" + monthlyPay +
                ", payRate=" + payRate +
                '}';
    }
}
