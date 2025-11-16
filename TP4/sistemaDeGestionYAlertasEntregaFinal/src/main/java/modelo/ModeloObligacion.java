package modelo;

public class ModeloObligacion {
    private int id;
    private String nombre;
    private String descripcion;
    private int cuit;

    public ModeloObligacion() {
    }

    public ModeloObligacion(int id, String nombre, String descripcion, int cuit) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cuit = cuit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
    
}
