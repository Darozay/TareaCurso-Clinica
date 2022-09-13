package dol;

import static misc.DateOperator.Fecha;
import static misc.DateOperator.getEdad;

public class Persona {
    
    private String pNombre,sNombre,pApellido,sApellido,DNI,dia,mes,año,genero;
    
    public Persona(){}

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    public void genero(String genero){
        this.genero=genero;
    }
    
    public String getGenero(){
        genero=genero.toLowerCase();
        if("masculino".equals(genero))return "Masculino";
        if("femenino".equals(genero))return "Femenino";
        else return "Ingrese un genero valido\nMaculino\nFemenino";
    }
    
    public String Edad(){
        return getEdad(dia,mes,año);
    }

    @Override
    public String toString() {
        return "Nombre="+pNombre+" "+sNombre+" "+pApellido+" "+sApellido+"\nDNI="+DNI+"\ngenero="+genero+"\n"+Edad()+"\nFecha de nacimiento="+Fecha(dia,mes,año);
    }
}
