package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class Main {


        public static Connection ConectarBD(){
            Connection conexion;
            String host = "jdbc:mysql://localhost/";
            String user = "deo";
            String pass = "osvaldo999";
            String bd = "BDIncidente";

            System.out.println("Conectando........");

            try {
                conexion = DriverManager.getConnection(host+bd,user,pass);
                System.out.println("Conexion Exitosa!!!");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }

            return conexion;
        }

        public static void main(String[] args) {


        Connection bd = ConectarBD();
        }

}