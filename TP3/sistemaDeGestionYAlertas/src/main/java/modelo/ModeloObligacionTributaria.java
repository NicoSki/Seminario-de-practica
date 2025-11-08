package modelo;

import java.time.LocalDate; //Cuyo formato de fecha es "yyyy-mm-dd"

public class ModeloObligacionTributaria {
    //Creo sus atributos:
    private int idObligacion;
    private String nombre;
    private String descripcion;
    private LocalDate fechaVencimiento;

    //Creo el contructor
    public ModeloObligacionTributaria(int idObligacion, String nombre, String descripcion) {
        this.idObligacion = idObligacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    //Creo los getters y setters de la clase:
    public int getIdObligacion() {
        return idObligacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    

    public void setIdObligacion(int idObligacion) {
        this.idObligacion = idObligacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    @Override
    public String toString(){
        return "ID: " +idObligacion + " | Nombre: "+nombre+ " | Descripcion: "+descripcion+ " |";
    }
}
