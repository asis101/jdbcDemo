package com.vastika.ps;

import com.vastika.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

    public static final String SQL = "update user_tbl set user_name=?, password=? where id=?";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "krisha");
            ps.setString(2, "kk");
            ps.setInt(3, 6);
            ps.executeUpdate();
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
