
import model.controller.EmployeeController;
import repo.ConnectionFactory;
import repo.MysqlConnection;
import service.EmployeeService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        MysqlConnection sqlConnection = new MysqlConnection();

        EmployeeService employeeService = new EmployeeService(sqlConnection);

        EmployeeController employeeController = new EmployeeController(employeeService);
        employeeController.createEmployee();

    }
}