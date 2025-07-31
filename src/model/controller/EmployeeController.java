package model.controller;

import model.*;
import service.EmployeeService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    public void createEmployee() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("****** Employee Registration Form ********");
        System.out.print("Enter Name: "); // Name valid
        String uName = scan.nextLine();
        System.out.print("Enter Email: ");  //email Valid
        String uEmail = scan.next();
        System.out.print("Enter Password: ");
        String uPass = scan.next();
        System.out.print("Enter Phone number: ");
        String uPhone = scan.next();
        scan.nextLine();
        System.out.print("Enter Address");
        String uAddr = scan.nextLine();
        System.out.println("Enter Role:\n<1> For ADMIN\n<2> EMPLOYEE\n<3> HR");
        int role = scan.nextInt();
        Role uRole = null;
        switch (role) {
            case 1:
                 uRole = Role.ADMIN;
                break;
            case 2:
                 uRole = Role.EMPLOYEE;
                break;
            case 3:
                 uRole = Role.HR;
                break;
            default:
                System.out.println("Invalid Input");

        }

        System.out.println("""
                Enter Position \n<1>HR Manager <2>Software Engineer <3>Marketing Specialist
                <4>Sale Representative <5>Financial Analyst""");
        System.out.print("-> ");
        int uPosition = scan.nextInt();

        System.out.println("""
                Enter Department <1> Engineering <2> Marketing <3> Sales
                <4> Human Resources <5> Finance""");
        int uDeprt = scan.nextInt();
        System.out.print("Enter Salary: ");
        double uSalary = scan.nextDouble();
        System.out.println("Job Started Date");
        System.out.println("->Year: ");
        int uYear = scan.nextInt();
        System.out.println("->Month");
        int uMonth = scan.nextInt();
        String uDate = new String(String.valueOf(uYear))+ "|"+new String(String.valueOf(uMonth));
        Status uStatus = Status.ACTIVE;
        int uBenefitId = 5;
        System.out.println("Enter Job Type <1> PartTime <2> FullTime");
        int jobType = scan.nextInt();
        JobType uJobType = null;
        switch (jobType){
            case 1:
                uJobType = JobType.PARTTIME;
                break;
            case 2:
                uJobType = JobType.FULLTIME;
                break;
            default:
                System.out.println("Invalid Input");
        }
        Employee newEmployee = new Employee(uName,uEmail,uPass,uPhone,uAddr,uRole,uPosition,uDeprt,uSalary,uDate,"null",uJobType,uBenefitId,uStatus);
        employeeService.registerEmployee(newEmployee);
    }
}
