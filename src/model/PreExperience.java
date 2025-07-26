package model;

import java.time.LocalDate;

public class PreExperience {
    private int prevExp_id;
    private String employeeId;
    private String company_name;
    private String job_title;
    private LocalDate job_started_date;
    private LocalDate job_ended_date;

    public PreExperience(int prevExp_id, String employeeId, String company_name, String job_title, LocalDate job_started_date, LocalDate job_ended_date) {
        this.prevExp_id = prevExp_id;
        this.employeeId = employeeId;
        this.company_name = company_name;
        this.job_title = job_title;
        this.job_started_date = job_started_date;
        this.job_ended_date = job_ended_date;
    }


    public PreExperience(){

    }

    public int getPrevExp_id() {
        return prevExp_id;
    }

    public void setPrevExp_id(int prevExp_id) {
        this.prevExp_id = prevExp_id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public LocalDate getJob_started_date() {
        return job_started_date;
    }

    public void setJob_started_date(LocalDate job_started_date) {
        this.job_started_date = job_started_date;
    }

    public LocalDate getJob_ended_date() {
        return job_ended_date;
    }

    public void setJob_ended_date(LocalDate job_ended_date) {
        this.job_ended_date = job_ended_date;
    }
}
