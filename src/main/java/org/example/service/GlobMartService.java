package org.example.service;

import org.example.entity.Employee;
import org.example.entity.Loan;

import java.util.List;

public interface GlobMartService {
    List<Employee> getAll();
    Employee addEmployee(Employee employee);
    Loan addLoan(Loan loan);
    Boolean checkEligibility(Employee employee);
}
