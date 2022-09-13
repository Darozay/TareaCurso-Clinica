package ui;

import dol.Paciente;
import java.util.Scanner;

public class Registro {
    
    Paciente a=new Paciente();
    Scanner sc=new Scanner(System.in);
    private String dia,mes,año;
    Menu b=new Menu();
    String Expediente;
    
    private void registroFecha(){
        System.out.println("_________________________________________________________________________________");
        System.out.println("Ingrese su fecha de nacimiento");
        do{
        System.out.print("Ingrese el dia: ");
        dia=sc.next();
        a.setDia(dia);
        System.out.print("Ingrese el mes: ");
        mes=sc.next();
        a.setMes(mes);
        System.out.print("Ingrese el año(se espera un año de 4 digitos): ");
        año=sc.next();
        a.setAño(año);
        if("La fecha que ingreso es invalida".equals(a.Edad()))System.out.println("Ingrese una fecha valida");
        }while("La fecha que ingreso es invalida".equals(a.Edad()));
    }
    private void registroGenero(){
        System.out.println("_________________________________________________________________________________");
        System.out.println("El programa espera el genero masculino o femenino");
        do{
            System.out.print("Ingrese su genero: ");
            a.genero(sc.next());
            if("Ingrese un genero valido\nMaculino\nFemenino".equals(a.getGenero()))System.out.println("Ingrese un genero valido");
        }while("Ingrese un genero valido\nMaculino\nFemenino".equals(a.getGenero()));
    }
    public String getPaciente(){
        return a.Show()+"\nExpediente="+Expediente+"\n"+b.getPaciente();
    }
    public String getExpediente(){
        return Expediente;
    }
    public void registroPersona(String expediente,boolean existe){
        System.out.println("_________________________________________________________________________________");
        System.out.print("Ingrese el primer nombre: ");
        a.setpNombre(sc.next());
        
        System.out.print("Ingrese el segundo nombre: ");
        a.setsNombre(sc.next());
        
        System.out.print("Ingrese el primer apellido: ");
        a.setpApellido(sc.next());
        
        System.out.print("Ingrese el segundo apellido: ");
        a.setsApellido(sc.next());
        
        System.out.print("Ingrese el DNI: ");
        a.setDNI(sc.next());
        
        registroFecha();
        Expediente=a.getExpediente(existe,expediente);
        registroGenero();
        b.showMenu();
    }
}
