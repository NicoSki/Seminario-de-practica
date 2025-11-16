package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ModeloClienteDAO {
    ModeloConexionBD cn = new ModeloConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarCliente(ModeloCliente cliente) throws ClassNotFoundException{
        String sql = "INSERT INTO clientes (cuit, razon_social, email, direccion, contribuyente, inicio_actividad) VALUES (?,?,?,?,?,?)";
        try{
           con = cn.conectarBaseDatos();
           ps = con.prepareStatement(sql);
           
           ps.setInt(1, cliente.getCuit());
           ps.setString(2, cliente.getRazonSocial());
           ps.setString(3, cliente.getEmail());
           ps.setString(4, cliente.getDireccion());
           ps.setString(5, cliente.getContribuyente());
           long fecha = cliente.getInicioActividad().getTime();
           java.sql.Date fechaSQL = new java.sql.Date(fecha);
           ps.setDate(6, fechaSQL);
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
    
    public List listarClientes() throws ClassNotFoundException{
        List<ModeloCliente> listaCliente = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try{
            con = cn.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ModeloCliente cliente = new ModeloCliente();
                cliente.setCuit(rs.getInt("cuit"));
                cliente.setRazonSocial(rs.getString("razon_social"));
                cliente.setEmail(rs.getString("email"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setContribuyente(rs.getString("contribuyente"));
                cliente.setInicioActividad(rs.getDate("inicio_actividad"));
                listaCliente.add(cliente);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return listaCliente;
    }
    
    public boolean eliminarCliente(int cuit){
        String sql = "DELETE FROM clientes WHERE cuit = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,cuit);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException ex){
                System.out.println(ex.toString());
            }
        }
    }
    
    public boolean modificarCliente(ModeloCliente cliente){
        String sql = "UPDATE clientes SET cuit=?, razon_social=?, email=?, direccion=?, contribuyente=?, inicio_actividad=? WHERE cuit=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getCuit());
            ps.setString(2, cliente.getRazonSocial());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getContribuyente());
            ps.setString(6, "2025-10-25");
            ps.setInt(7, cliente.getCuit());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
}
