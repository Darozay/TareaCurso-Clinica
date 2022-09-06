package misc;

public class Servicio {
    
    private String servicio;
    private int precio;
    
    public Servicio(String servicio,int precio){
        this.precio=precio;
        this.servicio=servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "servicio " + servicio + ", precio=" + precio;
    }
    
}
