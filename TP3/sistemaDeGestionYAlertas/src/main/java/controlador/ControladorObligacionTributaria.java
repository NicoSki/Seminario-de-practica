
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.ModeloObligacionTributaria;

public class ControladorObligacionTributaria {
    //Creo la lista en donde se van a almacenar los clientes:
    public List<ModeloObligacionTributaria> obligaciones;
    
    //Creo el contructor:

    public ControladorObligacionTributaria() {
        obligaciones = new ArrayList<>();
        //Agrego las obligaciones de forma manual, a modo de prueba:
        obligaciones.add(new ModeloObligacionTributaria(1,"IVA", "IMPUESTO AL VALOR AGREGADO"));
        obligaciones.add(new ModeloObligacionTributaria(2,"IIBB", "INGRESOS BRUTOS"));
        obligaciones.add(new ModeloObligacionTributaria(3,"SEH", "SEGURIDAD E HIGIENE"));
    }
    
    //Listo a las obligaciones:
    public void obtenerObligaciones(){
        if(obligaciones.isEmpty()){
            System.out.println("-------------------------------");
            System.out.println("No se agregaron obligaciones aun");
            System.out.println("-------------------------------");
        }else{
            System.out.println("-------LISTA CLIENTES-------");
            for(ModeloObligacionTributaria obligacion: obligaciones){
                System.out.println(obligacion);
            }
        }
    }
    
}
