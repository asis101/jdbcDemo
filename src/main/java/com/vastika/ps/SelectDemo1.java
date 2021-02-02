package com.vastika.ps;

import com.vastika.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo1 {
    public static final String SQL = "select * from user_tbl";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("Id is: " + rs.getInt(1));
                System.out.println("Username is: " + rs.getString(2));
                System.out.println("Password is: " + rs.getString(3));
                System.out.println("==============");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
