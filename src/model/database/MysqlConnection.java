package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection implements ConnectionFactory{
    private static final String url = "jdbc:mysql://localhost:3306/hrms";
    private static final String userName= "root";
    private static final String password = "Qwerty123@";
    private Connection connection;

    @Override
    public Connection createConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url, userName, password);
            return connection;


        }catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

}
