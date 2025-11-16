package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ModeloLogIn {
    Connection conexion;
    PreparedStatement ps;
    ResultSet rs;
    ModeloConexionBD cn = new ModeloConexionBD();
    
    public ModeloUsuarios ingreso(String email, String contrasena){
        ModeloUsuarios log = new ModeloUsuarios();
        String sql = "SELECT * FROM usuarios WHERE email = ? AND contrasena = ?";
        try{
            conexion = cn.conectarBaseDatos();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, contrasena);
            rs = ps.executeQuery();
            if(rs.next()){
               log.setNombre("nombre");
               log.setApellido("apellido");
               log.setEmail("email");
               log.setRol("rol");
               log.setContrasena("contrasena");
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return log;
    }
}
