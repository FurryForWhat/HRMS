package model.database;

import java.sql.*;

public interface  ConnectionFactory  {
    Connection createConnection() throws SQLException;
    void closeConnection() throws SQLException;
}
