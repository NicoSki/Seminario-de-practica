package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ModeloControlDAO {
    
    ModeloConexionBD cn = new ModeloConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarNotificacion(int cuit, String obligacion, String estado) throws ClassNotFoundException{
       String sql = "INSERT INTO controldenotificaciones (cuit, obligacion, estado) VALUES (?,?,?)";
       try{
           con = cn.conectarBaseDatos();
           ps = con.prepareStatement(sql);
           
           ps.setInt(1, cuit);
           ps.setString(2, obligacion);
           ps.setString(3, estado);
           ps.execute();
           return true;
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());
           return false;
       }finally{
           try{
               con.close();
           }catch(SQLException e){
               System.out.println(e.toString());
           }
       }
    }

    public List listarNofiticaciones() throws ClassNotFoundException{
        List<ModeloControl> listaControl = new ArrayList<>();
        String sql = "SELECT * FROM controldenotificaciones";
        try{
            con = cn.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ModeloControl control = new ModeloControl();
                control.setCuit(rs.getInt("cuit"));
                control.setObligacion(rs.getString("obligacion"));
                control.setFechaEnvio(rs.getDate("fecha_envio"));
                control.setEstado(rs.getString("estado"));
                listaControl.add(control);
                
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return listaControl;
    } 
}
