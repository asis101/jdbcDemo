package com.vastika.ps;

import com.vastika.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static final String SQL = "insert into user_tbl(user_name, password) values (?, ?)";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "goapl");
            ps.setString(2, "gg");
            ps.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
