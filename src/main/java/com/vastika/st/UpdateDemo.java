package com.vastika.st;

import com.vastika.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

    public static final String SQL = "update user_tbl set user_name='krishna', password='kk' where id=4";

    public static void main(String[] args) {
        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
