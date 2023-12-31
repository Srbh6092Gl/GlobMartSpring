package org.example.entity;

import org.example.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private String role;
    private String department;
    @Autowired
    private Address address;
    public Employee(){

    }

    public Employee(int empId, String firstName, String lastName, String role, String department, Address address) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.department = department;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                ", address=" + address +
                '}';
    }
}
