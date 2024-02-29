package com.example.EmployeeAPI.model;

public class EmployeeDetails {
    private String employeeID;
    private String employeeName;
    private String baseLocation;

    private String phoneNo;

    public EmployeeDetails(){

    }

    public EmployeeDetails(String employeeID, String employeeName, String baseLocation, String phoneNo) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.baseLocation = baseLocation;
        this.phoneNo = phoneNo;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
