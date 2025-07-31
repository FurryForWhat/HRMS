package repo;

import model.Employee;
import model.database.MysqlConnection;
import util.EmployeeIndexFinder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRepo {
    private final MysqlConnection mysqlConnection;
    private final EmployeeIndexFinder employeeIndexFinder;

    public EmployeeRepo(MysqlConnection mysqlConnection){
        this.mysqlConnection = mysqlConnection;
        employeeIndexFinder = new EmployeeIndexFinder(this.mysqlConnection);
    }
    public void saveEmployee(Employee employee) throws SQLException {

        String query = "INSERT INTO employees " +
                "(employee_id,name, email, password, phone_no, address, role, position_id, department_id, salary, job_started_date,job_ended_date,status,benefits_id,job_type) "+
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = this.mysqlConnection.createConnection();
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        employee.setEmployeeId(employeeIndexFinder.nextIndex());
        preparedStatement.setInt(1,employee.getEmployeeId());
        preparedStatement.setString(2,employee.getName());
        preparedStatement.setString(3,employee.getEmail());
        preparedStatement.setString(4,employee.getPassword());
        preparedStatement.setString(5,employee.getPhoneNo());
        preparedStatement.setString(6,employee.getAddress());
        preparedStatement.setString(7,employee.getRole().name());
        preparedStatement.setInt(8,employee.getPositionId());
        preparedStatement.setInt(9,employee.getDepartmentId());
        preparedStatement.setDouble(10,employee.getSalary());
        preparedStatement.setString(11,employee.getJob_startedDate());
        preparedStatement.setString(12,employee.getJob_endedDate());
        preparedStatement.setString(13,employee.getStatus().name());
        preparedStatement.setInt(14,employee.getOtherBenefits());
        preparedStatement.setString(15,employee.getJobType().name());
        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Data inserted successfully! ✅");
        }


    }
}
