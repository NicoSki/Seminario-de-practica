package controlador;

import java.util.*;
import java.time.LocalDate;
import modelo.ModeloCliente;
import modelo.ModeloObligacionTributaria;
import modelo.ModeloPeriodo;

public class ControladorNotificacion {
    private List<ModeloCliente> clientes;
    private List<ModeloObligacionTributaria> obligaciones;
    private List<ModeloPeriodo> periodos;
    
    //Creo el controlador:
    public ControladorNotificacion(ControladorCliente cc, ControladorObligacionTributaria co, ControladorPeriodo cp) {
        this.clientes = cc.clientes;
        this.obligaciones = co.obligaciones;
        this.periodos = cp.periodos;
    }
    
    //Creo un metodo para analizar la informacion antes de crear la notificacion:
    public void procesarInformacion(){
        //Creo una estructura de datos compuesta para por agrupar a los clientes por obligacion y fecha de vencimiento
        Map<String, List<ModeloCliente>> mapaInformacion = new HashMap<>();
        //Tomo como referencia la fecha actual:
        LocalDate hoy = LocalDate.now();
        
        //Luego itero sobre los periodos ya que:
        for(ModeloPeriodo periodo: periodos){
            //1ro: Las obligaciones se presentan a mes vencido, es decir, en Octubre se presentan las declaraciones de Septiembre:
            if(periodo.getMes() != hoy.getMonthValue() - 1 || periodo.getAno() != hoy.getYear()){
                continue;
            }
            
            //2do: Verifico que falten 4 dias para el vencimiento:
            if(hoy.until(periodo.getFechaVencimiento()).getDays() <= 4){
                continue;
            }
            
            //3ro: Asocio aquellos clientes que tengan la obligacion:
            for(ModeloCliente cliente: clientes){
                if(cliente.getContribuyente().equalsIgnoreCase("Monotributo") && periodo.getNombreObligacion().equals("IIBB")){
                    //Agrego la clase para componer a notificacion e ir armando el contenido:
                    componerNotificacion(mapaInformacion, periodo, cliente);
                }else if(cliente.getContribuyente().equalsIgnoreCase("Responsable Inscripto")){
                    componerNotificacion(mapaInformacion, periodo, cliente);
                }
            }
            
        }
        
        //Simulacro del envio:
        for(String clave: mapaInformacion.keySet()){
            //Divido el String en dos partes
            String[] partes = clave.split("\\|");
            //Tomo la primera posicion que ya que me retorna el nombre de la obligacion
            String nombreObligacion = partes[0];
            //Lo mismo pero con la segunda posicion, en este caso, la fecha de vencimiento
            String fechaVencimiento = partes[1];
            //Luego recupero la lista de los clientes asociados
            List<ModeloCliente> clientesNotificados = mapaInformacion.get(clave);
            //Llamo a la funcion que va a simular la notificacion
            simulacroNotificacion(nombreObligacion, fechaVencimiento, clientesNotificados);
        }
    }
    
    //Con la siguiente funcion, voy a agregar al cliente al grupo de notificacion. En donde lo agrupo por nombre de obligacion y fecha de vencimiento(Con la ayuda del Map)
    private void componerNotificacion(Map<String, List<ModeloCliente>> mapa, ModeloPeriodo periodo, ModeloCliente cliente){
        String clave = periodo.getNombreObligacion() + " | " + periodo.getFechaVencimiento();
        mapa.computeIfAbsent(clave, i -> new ArrayList<>()).add(cliente);
    }
    
    //Por ultimo defino la estructura de mi notificacion
    private void simulacroNotificacion(String obligacion, String fechaVto, List<ModeloCliente> clientes){
        String asuntoNotificacion = "Recordatorio de vencimiento de la obligacion " + obligacion;
        StringBuilder cuerpoNotificacion = new StringBuilder();
        
        cuerpoNotificacion.append("Estimado colaborador \n\n");
        cuerpoNotificacion.append("Esta notificacion tiene como finalidad reportar que la obligacion ").append(obligacion).append("vence el dia ").append(fechaVto).append("\n");
        cuerpoNotificacion.append("Tenga en consideracion que los clientes que deben presentar la correspondiente declaracion son: \n");
        
        for(ModeloCliente cliente: clientes){
            cuerpoNotificacion.append("--> ").append(cliente.getRazonSocial()).append("\n");
        }
        
        cuerpoNotificacion.append("\n Por favor realizar la presentacion lo antes posible \n");
        cuerpoNotificacion.append("\n Atte: Sistema de Gestion y Alertas");
        
        
        System.out.println("====================");
        System.out.println("Asunto: " + asuntoNotificacion);
        System.out.println("Cuerpo Notificacion \n: " + cuerpoNotificacion);
        System.out.println("====================");
    }
}
