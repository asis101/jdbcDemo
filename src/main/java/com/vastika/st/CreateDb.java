package com.vastika.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDb {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";
    public static final String SQL = "create database batch10_db";

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            //1. register the driver
            Class.forName(DRIVER);
            //2. obtain the connection object
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            //3. obtain the statement object
            st = con.createStatement();
            //4. execute the query
            st.executeUpdate(SQL);

            System.out.println("db created");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //5. close the connection
                con.close();
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
