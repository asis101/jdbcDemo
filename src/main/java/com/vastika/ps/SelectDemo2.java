package com.vastika.ps;

import com.vastika.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo2 {
    public static final String SQL = "select * from user_tbl where id=?";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1, 2);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("Id is: " + rs.getInt("id"));
                System.out.println("Username is: " + rs.getString("user_name"));
                System.out.println("Password is: " + rs.getString("password"));
                System.out.println("==============");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
