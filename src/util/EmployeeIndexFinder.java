package util;

import model.database.MysqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeIndexFinder {
    private final MysqlConnection mysqlConnection;

    public EmployeeIndexFinder(MysqlConnection mysqlConnection){
        this.mysqlConnection = mysqlConnection;
    }

    public int nextIndex() throws SQLException {
        int index = 0;
        String query = "SELECT MAX(employee_id) from employees";
        Connection connection = mysqlConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            index = resultSet.getInt(1);
        }
    return index+1;
    }
}
