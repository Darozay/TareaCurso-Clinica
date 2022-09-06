package ui;

import java.util.Scanner;
import misc.Condicional;

public class Menu implements IMenu{
    Scanner sc=new Scanner(System.in);
    MenuServicio a=new MenuServicio();
    String v;
    int cont;
    
    @Override
    public void Menu(){
        System.out.println("_________________________________________________________________________________");
        System.out.print("1.Especialidades\n2.Salir\nEscoja la opcion deseada: ");
    }
    
    @Override
    public void showMenu(){
        cont=0;
        v="";
        String opc;
        do{
        Menu();
        opc=sc.next();
        if( null == opc)System.out.println("Opcion invalida");
        else switch (opc) {
                case "1" -> {
                    a.showMenu();
                    v=v+a.getPaciente();
                    cont=cont+a.getDeuda();
            }
                case "2" -> System.out.println("¡Tenga buen dia!");
                default -> System.out.println("Opcion invalida");
            }
        
        }
        while(!"2".equals(opc));
    }
    public String getPaciente(){
        return Condicional.Ficha("\n"+v+"\nDeuda= "+cont);
    }
}

