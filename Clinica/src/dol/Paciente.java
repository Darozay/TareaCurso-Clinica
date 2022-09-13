package dol;

import misc.Condicional;
import misc.DateOperator;

public class Paciente extends Persona implements IShow{
    
    public Paciente() {
        super();
    }
    public String getExpediente(boolean expediente, String string){
        if(expediente==true)return string;
        else return Condicional.ValoresAleatorios();
    }
    @Override
    public String Show(){
        return toString()+"\nFecha Actual="+DateOperator.FechaActual();
    }
}
