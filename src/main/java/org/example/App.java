package org.example;

import org.example.entity.Address;
import org.example.entity.Employee;
import org.example.entity.Loan;
import org.example.service.GlobMartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GlobMartService globMartService = context.getBean(GlobMartService.class);

        Address lko = new Address("Lucknow", "Uttar Pradesh", 200200);
        Address gkp = new Address("Gorakhpur", "Uttar Pradesh", 200430);
        Address blr = new Address("Bangalore", "Karnataka", 200003);
        Address del = new Address("Delhi", "UT of Delhi", 200300);

        //1
        Employee emp1 = new Employee(1, "srbh", "singh","Employee", "Engineering", gkp);
        Employee emp2 = new Employee(2, "saurabh", "s","Employee", "Engineering", blr);
        Employee emp3 = new Employee(3, "s", "singh","Manager", "Engineering", del);
        globMartService.addEmployee(emp1);
        globMartService.addEmployee(emp2);
        globMartService.addEmployee(emp3);
        globMartService.getAll().forEach(System.out::println);

        Loan loan1 = new Loan(1, emp1.getEmpId(), 3000.5, 250.0, 12, 2250.5, "Open");
        Loan loan2 = new Loan(1, emp3.getEmpId(), 4000.5, 250.0, 16, 3250.5, "Open");
        Loan loan3 = new Loan(1, emp2.getEmpId(), 4000.5, 250.0, 16, 3250.5, "Closed");

        System.out.println("Employee for: "+emp1);
        System.out.println("Eligibility: "+globMartService.checkEligibility(emp1));

        System.out.println("Employee for: "+emp2);
        System.out.println("Eligibility: "+globMartService.checkEligibility(emp2));

        System.out.println("Employee for: "+emp3);
        System.out.println("Eligibility: "+globMartService.checkEligibility(emp3));

    }
}
