package service;

import model.Employee;
import model.database.MysqlConnection;
import repo.EmployeeRepo;
import util.EmployeeIndexFinder;

import java.sql.*;

public class EmployeeService {
    private EmployeeRepo employeeRepo;

   public EmployeeService(EmployeeRepo employeeRepo){
       this.employeeRepo = employeeRepo;

   }

    public void registerEmployee(Employee employee) {
            try{
                if(employee != null){
                    employeeRepo.saveEmployee(employee);
                }
            }
            catch (Exception e){
                System.out.println(e.getStackTrace());
            }
    }

    public void deleteEmployee(int employeeId) {
        // This method is currently empty. Implementation needed for deleting an employee.
        throw new UnsupportedOperationException("Method not implemented yet.");
    }

    public void updateEmployee(int employeeId) {
        // This method is currently empty. Implementation needed for updating an employee.
        throw new UnsupportedOperationException("Method not implemented yet.");
    }
//    public void getAllEmployees(){
//        List<Employee> employeeList = new ArrayList();
//        String query = "SELECT * FROM employees";
//
//        try(Connection conn = connectionFactory.createConnection();
//            Statement stmt = conn.createStatement();
//            ResultSet s = stmt.executeQuery(query)){
//            while(s.next()) {
//                int employeeId = s.getInt("employee_id");
//                String name = s.getString("name");
//                String email = s.getString("email");
//                String password = s.getString("password");
//                String phoneNo = s.getString("phone_no");
//                String address = s.getString("address");
//                Role.valueOf(s.getString("role").toUpperCase());
//
//                int positionId = s.getInt("position_id");
//                int departmentId = s.getInt("department_id");
//                int otherBenefits = s.getInt("benefits_id");
//                double salary = s.getDouble("salary");
////                LocalDate jobStartedDate = s.getDate("job_started_date").toLocalDate();
////                LocalDate jobEndedDate = s.getDate("job_ended_date").toLocalDate();
//                java.sql.Date startDate = s.getDate("job_started_date");
//                YearMonth jobStartedDate = startDate != null ? YearMonth.from(startDate.toLocalDate()) : null;
//
//                java.sql.Date endDate = s.getDate("job_ended_date");
//                String jobEndedDate = s.getString("job_ended_date");
//                Status.valueOf(s.getString("status").toUpperCase());
//                JobType.valueOf(s.getString("job_type").toUpperCase());
//
//
//                Employee employee = new Employee(
//                        employeeId,
//                        name,
//                        email,
//                        password,
//                        phoneNo,
//                        address,
//                        Role.valueOf(s.getString("role").toUpperCase()),
//                        positionId,
//                        departmentId,
//                        otherBenefits,
//                        salary,
//                        jobStartedDate,
//                        jobEndedDate,
//                        JobType.valueOf(s.getString("job_type").toUpperCase()),
//                        Status.valueOf(s.getString("status").toUpperCase())
//                );
//                employeeList.add(employee);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        for(Employee employee : employeeList) {
//            System.out.println("Employee ID: " + employee.getEmployeeId());
//            System.out.println("Name: " + employee.getName());
//            System.out.println("Email: " + employee.getEmail());
//            System.out.println("Phone No: " + employee.getPhoneNo());
//            System.out.println("Address: " + employee.getAddress());
//            System.out.println("Role: " + employee.getRole());
//            System.out.println("Position ID: " + employee.getPositionId());
//            System.out.println("Department ID: " + employee.getDepartmentId());
//            System.out.println("Salary: " + employee.getSalary());
//            System.out.println("Job Started Date: " + employee.getJob_startedDate());
//            System.out.println("Job Ended Date: " + employee.getJob_endedDate());
//            System.out.println("Job Type: " + employee.getJobType());
//            System.out.println("Status: " + employee.getStatus());
//            System.out.println("-----------------------------");
//        }
//    }


}
