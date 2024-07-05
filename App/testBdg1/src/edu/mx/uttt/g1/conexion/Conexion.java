package edu.mx.uttt.g1.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {

    private static Connection con;

    public static Connection conectar() {
        con = null;

        String url = "jdbc:sqlserver://localhost:1433;databaseName=NORTHWND;encrypt=true;trustServerCertificate=true";

        //Credenciales de la base de datos
        String user = "sa";
        String password = "123456";

        try {
            //Establecer conexion
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa con la base de datos");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

    public static void cerrarConexion() {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
            }
        } else {
            System.out.println("La conexion esta cerraada");
        }
    }

}
