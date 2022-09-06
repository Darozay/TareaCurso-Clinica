package ui;

import java.util.ArrayList;
import java.util.Scanner;
import misc.Almacen;
import static misc.Condicional.Mostrador;

public class Opciones {
    
    ArrayList<String> a=new ArrayList<String>();
    Registro b=new Registro();
    Scanner sc=new Scanner(System.in);
    MenuPacientes g=new MenuPacientes();
    
    public void opciones(){
        System.out.println("_________________________________________________________________________________");
        System.out.println("1.Agregar personas");
        System.out.println("2.Editar personas");
        System.out.println("3.Ver personas");
        System.out.println("4.Eleminar persona");
        System.out.println("5.Salir");
        System.out.print("Usted selecciono: ");
    } 
    public void Manipulador(){
        int i=0;
        String opc,posicion;
        do{
        opciones();
        opc=sc.next();
        if( null == opc)System.out.println("Ingrese una opción válida");
        else switch (opc) {
                case "1" -> {
                    b.registroPersona(i);
                    a.add(b.getPaciente());
                    i++;
            }
                case "2" -> {
                    if(a.isEmpty())System.out.println("No hay ningun paciente");
                    else{
                    System.out.print("Ingrese la posicion del elemento: ");
                    posicion=sc.next();
                    b.registroPersona(Integer.parseInt(posicion));
                    try{
                    a.set(Integer.parseInt(posicion)-1, b.getPaciente());
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    }
            }
                case "3" -> g.showPaciente(a);
                case "4" -> {
                    System.out.print("Ingrese la posicion del elemento: ");
                    try{
                       posicion=sc.next();
                    a.remove(Integer.parseInt(posicion)-1);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
            }
                case "5" -> System.out.println("Usted ha salido");
                default -> System.out.println("Ingrese una opción válida");
            }
        }while(!"5".equals(opc));
    }
}
