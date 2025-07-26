package model.financial;

import java.time.LocalDate;

public class MonthlyFees {
    private int  monthlyFeesId;
    private int employeeId;
    private double basicSalary;
    private double bonus;
    private double deductions;
    private LocalDate paymentDate;
    private PaymentStatus paymentStatus;

    public MonthlyFees(int monthlyFeesId, int employeeId, double basicSalary, double bonus, double deductions, LocalDate paymentDate, PaymentStatus paymentStatus) {
        this.monthlyFeesId = monthlyFeesId;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.deductions = deductions;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getMonthlyFeesId() {
        return monthlyFeesId;
    }

    public void setMonthlyFeesId(int monthlyFeesId) {
        this.monthlyFeesId = monthlyFeesId;
    }

    public double calcMonthlyFees(){
        return basicSalary + bonus - deductions;
    }

}
