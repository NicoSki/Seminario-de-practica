package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.ModeloCliente;

public class ControladorCliente {
    //Creo la lista en donde se van a almacenar los clientes:
    public List<ModeloCliente> clientes;
    
    //Creo el contructor:
    public ControladorCliente() {
        clientes = new ArrayList<>();
        //Agrego los clientes de forma manual, a modo de prueba:
        clientes.add(new ModeloCliente(12123456, "Juan Perez", "JP@gmail.com", "Las flores 1778", "Responsable Inscripto","2001-12-20"));
        clientes.add(new ModeloCliente(21356854, "Carla Dominguez", "CD@gmail.com", "Santa Fe 600", "Monotributo","1987-05-01"));
        clientes.add(new ModeloCliente(34586987, "Marcos Lopez", "ML@gmail.com", "Belgrano 9875", "Responsable Inscripto","2007-11-15"));
        clientes.add(new ModeloCliente(23569752, "Martina Azul", "MA@gmail.com", "Calchaqui 100", "Monotributo","1995-02-06"));
    }
    
    //Listo a los clientes:
    public void obtenerClientes(){
        if(clientes.isEmpty()){
            System.out.println("-------------------------------");
            System.out.println("No se agregaron clientes aun");
            System.out.println("-------------------------------");
        }else{
            System.out.println("-------LISTA CLIENTES-------");
            for(ModeloCliente cliente: clientes){
                System.out.println(cliente);
            }
        }
    }
    
}
