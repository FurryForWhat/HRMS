package model.financial;

import java.time.LocalDate;

public class DailyFees {
    private int dailyFeesId;
    private int employeeId;
    private LocalDate date;
    private double dailyRate;
    private double overTimeHours;
    private double overTimeRate;
    private double deduction;
    private LocalDate paymentDate;
 private PaymentStatus paymentStatus;

    public DailyFees(int dailyFeesId, int employeeId, LocalDate date, double dailyRate, double overTimeHours, double overTimeRate,double deduction,LocalDate paymentDate,PaymentStatus paymentStatus) {
        this.dailyFeesId = dailyFeesId;
        this.employeeId = employeeId;
        this.date = date;
        this.dailyRate = dailyRate;
        this.overTimeHours = overTimeHours;
        this.overTimeRate = overTimeRate;
        this.deduction = deduction;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }
    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getDeduction() {
        return this.deduction;
    }
    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDailyFeesId() {
        return dailyFeesId;
    }

    public void setDailyFeesId(int dailyFeesId) {
        this.dailyFeesId = dailyFeesId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double calcDailyFees(){
        return dailyRate + (overTimeHours * overTimeRate) - deduction;
    }
}


