package com.backend;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {

    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection( "jdbc:h2:~/integrador;INIT=RUNSCRIPT FROM 'create.sql'","lj","jl");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
