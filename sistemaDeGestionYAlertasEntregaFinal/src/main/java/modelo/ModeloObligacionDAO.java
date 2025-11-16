
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ModeloObligacionDAO {
    Connection con;
    ModeloConexionBD cn = new ModeloConexionBD();
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarObligaciones() throws ClassNotFoundException{
        List<ModeloObligacion> listaObligacion = new ArrayList<>();
        String sql = "SELECT * FROM obligaciontributaria";
        try{
            con = cn.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ModeloObligacion obligacion = new ModeloObligacion();
                obligacion.setCuit(rs.getInt("cuit"));
                obligacion.setNombre(rs.getString("nombre"));
                obligacion.setDescripcion(rs.getString("descripcion"));
                listaObligacion.add(obligacion);
                
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return listaObligacion;
    }
}
