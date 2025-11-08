
package vista;

//anado librerias
import controlador.ControladorCliente;
import controlador.ControladorNotificacion;
import controlador.ControladorObligacionTributaria;
import controlador.ControladorPeriodo;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.InputMismatchException;

public class VistaPrincipal {
    //Creo la funcion principal para luego poder trasladarla al main del sistema
    public void vistaPrincipal() {
        //Utilizo el scanner para poder capturar las decisiones del usuario
        Scanner scanner = new Scanner(System.in);
        //Defino la variable para salir del sistema y solicitar el dato nuevamente en caso de una excepcion
        boolean salirDelSistema = false;
        boolean solicitarDatoNuevamente = false;
        int opcionUsuario=0;
        
        //Manejo el menu con un do/while:
        do{
            do{
                solicitarDatoNuevamente = false;
                try{
                    System.out.println("*Bienvenido al SISTEMA DE GESTION Y ALERTAS*");
                    System.out.println("====MENU DE OPCIONES====");
                    System.out.println("1-Listar a los clientes");
                    System.out.println("2-Listar Obligaciones");
                    System.out.println("3-Listar Periodos");
                    System.out.println("4-Envio notificacion");
                    System.out.println("5-Salir del sistema");
                    System.out.println("Ingrese una opcion:");
                    opcionUsuario = scanner.nextInt();
                }catch(Exception e){
                    System.out.println("-----------------------------------");
                    System.out.println("Ingresa un valor de caracter entero");
                    System.out.println("-----------------------------------");
                    solicitarDatoNuevamente = true;
                    //Limpio el buffer
                    scanner.nextLine();
                }
            }while(solicitarDatoNuevamente == true);
            
            //Creo un switch
            switch(opcionUsuario){
                case 1:
                    ControladorCliente controladorCliente = new ControladorCliente();
                    controladorCliente.obtenerClientes();
                    break;
                case 2:
                    ControladorObligacionTributaria controladorObligacion = new ControladorObligacionTributaria();
                    controladorObligacion.obtenerObligaciones();
                    break;
                case 3:
                    ControladorPeriodo controladorPeriodo = new ControladorPeriodo();
                    controladorPeriodo.obtenerPeriodos();
                    break;
                case 4:
                    ControladorCliente cc = new ControladorCliente();
                    ControladorObligacionTributaria co = new ControladorObligacionTributaria();
                    ControladorPeriodo cp = new ControladorPeriodo();
                    ControladorNotificacion cn = new ControladorNotificacion(cc,co,cp);
                    cn.procesarInformacion();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el sistema contable");
                    salirDelSistema = true;
                    break;    
                default:
                    System.out.println("-----------------------------------");
                    System.out.println("Ingrese un numero entero del 1 al 5");
                    System.out.println("-----------------------------------");
            }
        }while(!salirDelSistema);
        
        //Cierro el escaner antes de finalizar
        scanner.close();
    }
}
