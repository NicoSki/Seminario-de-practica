 package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModeloConexionBD {
    Connection conexion;
    
    public Connection conectarBaseDatos() throws ClassNotFoundException{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sistema_contable?serverTimezone=UTC";
        conexion = DriverManager.getConnection(url, "root", "");
        return conexion;
    }catch(SQLException e){
        System.err.println(e.toString());
    }
    return null;
    }
}
