package org.example.service;

import org.example.entity.Employee;
import org.example.entity.Loan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GlobMartServiceImpl implements GlobMartService{

    List<Employee> employees = new ArrayList<>();
    List<Loan> loans = new ArrayList<>();
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return  employee;
    }

    @Override
    public Loan addLoan(Loan loan) {
        loans.add(loan);
        return loan;
    }

    @Override
    public Boolean checkEligibility(Employee employee) {
        if(employee.getRole().equalsIgnoreCase("Manager") || employee.getRole().equalsIgnoreCase("GM"))
            return false;
        for (Loan loan: loans)
            if(loan.getEmpId() == employee.getEmpId() && loan.getStatus().equalsIgnoreCase("Open"))
                return false;
        return true;
    }
}
