package com.devops.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/ecommerce";
    private static final String USER = "ecommerce_user";
    private static final String PASS = "immaddy6400";

    public static Connection getConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

