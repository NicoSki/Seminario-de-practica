package modelo;

import java.util.Date;


public class ModeloCliente {
    private int cuit;
    private String razonSocial;
    private String email;
    private String direccion;
    private String contribuyente;
    private Date inicioActividad;

    //Creo el contructor
    public ModeloCliente() {
    }

    public ModeloCliente(int cuit, String razonSocial, String email, String direccion, String contribuyente, Date inicioActividad) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.email = email;
        this.direccion = direccion;
        this.contribuyente = contribuyente;
        this.inicioActividad = inicioActividad;
    }
    
    
    //Creo los getters y setters de la clase:
    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(String contribuyente) {
        this.contribuyente = contribuyente;
    }

    public Date getInicioActividad() {
        return inicioActividad;
    }

    public void setInicioActividad(Date inicioActividad) {
        this.inicioActividad = inicioActividad;
    }
}
