package com.gdinesh.persistence.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriverPractice {
    public void tinker() throws SQLException {
        String conURL = "jdbc:mysql://localhost:3306/learn_spring_jdbc";
        Connection conn =  DriverManager.getConnection(conURL, "root", "Ganesha@01");
        Statement statement = conn.createStatement();
        ResultSet resultSet =  statement.executeQuery("SELECT * from users_db");
        while(resultSet.next()) {
            Integer id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);

            System.out.printf("%d %s %s\n", id, name, email);
        }
    }
}
