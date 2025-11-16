package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ModeloPeriodoDAO {
    ModeloConexionBD cn = new ModeloConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public List listarPeriodos() throws ClassNotFoundException{
        List<ModeloPeriodo> listaPeriodo = new ArrayList<>();
        String sql = "SELECT * FROM periodos";
        try{
            con = cn.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ModeloPeriodo periodo = new ModeloPeriodo();
                periodo.setNombreObligacion(rs.getString("nombre_obligacion"));
                periodo.setMes(rs.getInt("mes"));
                periodo.setAnio(rs.getInt("anio"));
                periodo.setFechaVentcimiento(rs.getDate("fecha_vencimiento"));
                listaPeriodo.add(periodo);                
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return listaPeriodo;
    }
}
