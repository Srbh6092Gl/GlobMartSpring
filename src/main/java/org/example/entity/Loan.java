package org.example.entity;

public class Loan {
    private int loanId;
    private int empId;
    private double amount;
    private double emi;
    private int noOfInsatllment;
    private double balance;
    private String status;

    public Loan(int loanId, int empId, double amount, double emi, int noOfInsatllment, double balance, String status) {
        this.loanId = loanId;
        this.empId = empId;
        this.amount = amount;
        this.emi = emi;
        this.noOfInsatllment = noOfInsatllment;
        this.balance = balance;
        this.status = status;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public int getNoOfInsatllment() {
        return noOfInsatllment;
    }

    public void setNoOfInsatllment(int noOfInsatllment) {
        this.noOfInsatllment = noOfInsatllment;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", empId=" + empId +
                ", amount=" + amount +
                ", emi=" + emi +
                ", noOfInsatllment=" + noOfInsatllment +
                ", balance=" + balance +
                ", status='" + status + '\'' +
                '}';
    }
}
