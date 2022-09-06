package dol;

import java.util.Random;

public class Paciente extends Persona implements IShow{

    private int numeroPaciente;
    
    public Paciente() {
        super();
    }
    public void setNumeroPaciente(int i){
        numeroPaciente=i;
    }
    public String getExpediente(){
        Random a=new Random();
        char b=(char)(a.nextInt(26)+'a');
        return numeroPaciente+""+b;
    }
    @Override
    public String Show(){
        return toString()+"Numero del paciente= "+numeroPaciente+"\nExpediente= "+getExpediente();
    }
}
