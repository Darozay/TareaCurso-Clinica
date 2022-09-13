package misc;

import dol.Doctores;

public class Servicio {
    
    private String servicio;
    private int precio;
    private Doctores Doctor;
    
    public Servicio(String servicio,Doctores Doctor,int precio){
        this.precio=precio;
        this.servicio=servicio;
        this.Doctor=Doctor;
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

    public Doctores getDoctor() {
        return Doctor;
    }

    public void setDoctor(Doctores Doctor) {
        this.Doctor = Doctor;
    }

    @Override
    public String toString() {
        return "servicio " + servicio +", Doctor="+Doctor+", precio=" + precio;
    }
    
}
