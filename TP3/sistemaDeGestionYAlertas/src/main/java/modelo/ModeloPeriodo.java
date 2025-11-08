package modelo;
//Importo libreria para la fecha de vencimieto;
import java.time.LocalDate; //Cuyo formato de fecha es "yyyy-mm-dd"


public class ModeloPeriodo {
    private int idPeriodo;
    private int mes;
    private int ano;
    private LocalDate fechaVencimiento;
    private String nombreObligacion;
    
    //Creo el contructor:
    public ModeloPeriodo(int idPeriodo, int mes, int ano, LocalDate fechaVencimiento, String nombreObligacion) {
        this.idPeriodo = idPeriodo;
        this.mes = mes;
        this.ano = ano;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreObligacion = nombreObligacion;
    }
    
    //Creo los getters y setters:
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreObligacion() {
        return nombreObligacion;
    }

    public void setNombreObligacion(String nombreObligacion) {
        this.nombreObligacion = nombreObligacion;
    }
    
    @Override
    public String toString(){
        return "ID: " +idPeriodo + " | Mes: "+mes+ " | Ano: "+ano+ " | Fecha De Vencimiento: "+fechaVencimiento+" | Obligacion: " + nombreObligacion +" |";
    }
}
