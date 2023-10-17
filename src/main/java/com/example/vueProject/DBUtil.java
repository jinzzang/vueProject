package com.example.vueProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mariadb://192.168.0.210:3306/jinho";
        String id = "jinho";
        String pw = "ahxWYoo0gdpym3C8";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pw);
            return conn;
        } catch (Exception e) {
            System.out.println("DBUtil.getConnection() : " + e.toString());
        }
        return null;
    }
}
