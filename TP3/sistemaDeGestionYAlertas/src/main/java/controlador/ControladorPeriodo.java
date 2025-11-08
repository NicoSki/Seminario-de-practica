
package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.ModeloPeriodo;

public class ControladorPeriodo {
    //Creo la lista en donde se van a almacenar los clientes:
    public List<ModeloPeriodo> periodos;
    
    //Creo el contructor:
    public ControladorPeriodo(){
        periodos = new ArrayList<>();
        
        //Agrego los clientes de forma manual, a modo de prueba, por lo cual los datos son ficticios:
        //LocalDate.of(yyyy, mm, dd)
        periodos.add(new ModeloPeriodo(2, 9, 2025, LocalDate.of(2025,10,30), "IIBB"));             
        periodos.add(new ModeloPeriodo(5, 9, 2025, LocalDate.of(2025,10,30), "IVA"));      
        periodos.add(new ModeloPeriodo(8, 9, 2025, LocalDate.of(2025,10,31), "SEH")); //Este aviso no se notificara ya que no se cumplieron los 4 dias aun
    }
    
    //Listo a los periodos:
    public void obtenerPeriodos(){
        if(periodos.isEmpty()){
            System.out.println("-------------------------------");
            System.out.println("No se agregaron clientes aun");
            System.out.println("-------------------------------");
        }else{
            System.out.println("-------LISTA CLIENTES-------");
            for(ModeloPeriodo periodo: periodos){
                System.out.println(periodo);
            }
        }
    }
}
