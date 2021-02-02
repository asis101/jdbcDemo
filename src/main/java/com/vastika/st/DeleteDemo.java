package com.vastika.st;

import com.vastika.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

    public static final String SQL = "delete from user_tbl where id=4";

    public static void main(String[] args) {
        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data deleted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
