
package modelo;

import java.sql.Date;


public class ModeloPeriodo {
    private int id;
    private int mes;
    private int anio;
    private Date fechaVentcimiento;
    private int idObligacion;
    private String nombreObligacion;

    public ModeloPeriodo() {
    }

    public ModeloPeriodo(int id, int mes, int anio, Date fechaVentcimiento, int idObligacion, String nombreObligacion) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.fechaVentcimiento = fechaVentcimiento;
        this.idObligacion = idObligacion;
        this.nombreObligacion = nombreObligacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Date getFechaVentcimiento() {
        return fechaVentcimiento;
    }

    public void setFechaVentcimiento(Date fechaVentcimiento) {
        this.fechaVentcimiento = fechaVentcimiento;
    }

    public int getIdObligacion() {
        return idObligacion;
    }

    public void setIdObligacion(int idObligacion) {
        this.idObligacion = idObligacion;
    }

    public String getNombreObligacion() {
        return nombreObligacion;
    }

    public void setNombreObligacion(String nombreObligacion) {
        this.nombreObligacion = nombreObligacion;
    }
    
    
    
}
