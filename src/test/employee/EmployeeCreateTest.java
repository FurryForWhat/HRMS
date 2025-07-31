package test.employee;

import model.controller.EmployeeController;
import model.database.MysqlConnection;
import repo.EmployeeRepo;
import service.EmployeeService;

import java.sql.SQLException;

public class EmployeeCreateTest {
    public static void main(String[] args) throws SQLException {
        MysqlConnection mysqlConnection = new MysqlConnection();
        EmployeeRepo employeeRepo = new EmployeeRepo(mysqlConnection);
        EmployeeService employeeService = new EmployeeService(employeeRepo);
        EmployeeController employeeController = new EmployeeController(employeeService);
        employeeController.createEmployee();
    }
}
