package com.vastika;

import com.vastika.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL = "insert into user_tbl(user_name, password) values ('gopal', 'dd')";

    public static void main(String[] args) {
        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
