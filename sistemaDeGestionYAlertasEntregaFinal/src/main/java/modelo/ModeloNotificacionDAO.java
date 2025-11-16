package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ModeloNotificacionDAO {
    
    ModeloConexionBD cn = new ModeloConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    ModeloEmail email = new ModeloEmail();
    ModeloControlDAO control = new ModeloControlDAO();

    public ModeloNotificacionDAO() {
    }
    
    
    public boolean buscarClientesPorVencimiento(Date fecha) throws ClassNotFoundException{
        
        String sql = "SELECT c.razon_social, o.nombre, p.fecha_vencimiento FROM clientes c INNER JOIN obligaciontributaria o ON c.cuit = o.cuit INNER JOIN periodos p ON o.nombre = p.nombre_obligacion WHERE o.nombre = ( SELECT nombre_obligacion FROM periodos WHERE fecha_vencimiento >= CURDATE() AND fecha_vencimiento = DATE_ADD(?, INTERVAL 4 DAY) ORDER BY fecha_vencimiento ASC LIMIT 1) GROUP BY c.cuit, c.razon_social, o.nombre, p.fecha_vencimiento";
        String nombreObligacion = null;
        Date fechaVencimiento = null;
        
        long fechaFormato = fecha.getTime();
        java.sql.Date fechaSQL = new java.sql.Date(fechaFormato); 
        
        try{
            con = cn.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.setDate(1, fechaSQL);
            rs = ps.executeQuery();
            
            StringBuilder contenidoEmail = new StringBuilder();
                
                if(rs.next()){
                 nombreObligacion = rs.getString("nombre");
                 fechaVencimiento = rs.getDate("fecha_vencimiento");   
                 
                 contenidoEmail.append("<h1>Estimado usuario, notificamos por este medio que en los proximos 4 dias vencera la siguiente obligacion tributatia.</h1>").append("\n");
                 contenidoEmail.append("<br>");
                 contenidoEmail.append("<h2>Vencimiento de obligacion:</h2> "+fechaVencimiento).append("\n");
                 contenidoEmail.append("<br>");
                 contenidoEmail.append("<p>Clientes a los que se les deben efectual la presentacion:</p>").append("\n");
                 contenidoEmail.append("Razon Social: ").append("\n");
                 contenidoEmail.append("<br>");
                 
                 do{
                     String razonSocial = rs.getString("razon_social");
                     contenidoEmail.append("<li><strong>"+razonSocial+"</strong></li>").append("\n");
                 }while(rs.next());
                 
                 contenidoEmail.append("<br>");
                 contenidoEmail.append("<p>Atte: Sistema de gestion y alertas</p>");
                 
                 email.crearEmail("Notificacion sobre proximo vencimiento de obligacion: " +nombreObligacion, contenidoEmail.toString());
                 email.enviarNotificacion();
                 
                 control.registrarNotificacion(1, nombreObligacion, "Exitoso");
                 
                 return true;
                }
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                System.out.println(e.toString()); 
            }
        }
        return true;
    }
}
