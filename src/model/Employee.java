package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private String email;
    private String password;
    private String PhoneNo;
    private String address;
    private Role role;
    private int positionId;
    private int departmentId;
    private List<String> otherBenefits;
//    private double salary;
    private LocalDate job_startedDate;
    private LocalDate job_endedDate;
    private List<PreExperience> experiences;
    private JobType jobType;
    private Status status;

    public Employee(int employeeId, String name, String email, String password, String phoneNo, String address, Role role, int positionId, int departmentId,
                    List<String> otherBenefits, LocalDate job_startedDate, LocalDate job_endedDate,JobType jobType, Status status) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.password = password;
        PhoneNo = phoneNo;
        this.address = address;
        this.role = role;
        this.positionId = positionId;
        this.departmentId = departmentId;
        this.otherBenefits = otherBenefits;
//        this.salary = salary;
        this.job_startedDate = job_startedDate;
        this.job_endedDate = job_endedDate;
        this.jobType = jobType;
        this.experiences = new ArrayList<>();
        this.status = status;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public List<String> getOtherBenefits() {
        return otherBenefits;
    }

    public void setOtherBenefits(List<String> otherBenefits) {
        this.otherBenefits = otherBenefits;
    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    public LocalDate getJob_startedDate() {
        return job_startedDate;
    }

    public void setJob_startedDate(LocalDate job_startedDate) {
        this.job_startedDate = job_startedDate;
    }

    public LocalDate getJob_endedDate() {
        return job_endedDate;
    }

    public void setJob_endedDate(LocalDate job_endedDate) {
        this.job_endedDate = job_endedDate;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public List<PreExperience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<PreExperience> experiences) {
        this.experiences = experiences;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                ", address='" + address + '\'' +
                ", role=" + role +
                ", positionId=" + positionId +
                ", departmentId=" + departmentId +
                ", otherBenefits=" + otherBenefits +
//                ", salary=" + salary +
                ", job_startedDate=" + job_startedDate +
                ", job_endedDate=" + job_endedDate +
                ", prevExp_id=" +  experiences+
                ", jobType=" + jobType +
                ", status=" + status +
                '}';
    }
}
