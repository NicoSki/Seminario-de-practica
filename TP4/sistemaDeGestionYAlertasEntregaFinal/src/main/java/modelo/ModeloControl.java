package modelo;

import java.util.Date;

public class ModeloControl {
    private int id;
    private int cuit;
    private String obligacion;
    private Date fechaEnvio;
    private String estado;

    public ModeloControl() {
    }

    public ModeloControl(int id, int cuit, String obligacion, Date fechaEnvio, String estado) {
        this.id = id;
        this.cuit = cuit;
        this.obligacion = obligacion;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getObligacion() {
        return obligacion;
    }

    public void setObligacion(String obligacion) {
        this.obligacion = obligacion;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
