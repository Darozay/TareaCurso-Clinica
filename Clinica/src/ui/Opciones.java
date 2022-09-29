package ui;

import java.util.Scanner;
import dal.Almacen;
import misc.Condicional;

public class Opciones {
    
    private final Registro b=new Registro();
    private final Scanner sc=new Scanner(System.in);
    private final MenuPacientes g=new MenuPacientes();
    
    public void opciones(){
        System.out.println("+++++++++++++++++++Bienvenido al Sistema Clinico Vida Sana+++++++++++++++++++");
        System.out.println("1.Agregar paciente");
        System.out.println("2.Editar paciente");
        System.out.println("3.Ver paciente");
        System.out.println("4.Eliminar paciente");
        System.out.println("5.Salir");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Usted seleccionó: ");
    } 
    public void Manipulador(){
        String opc,Expediente;
        do{
        opciones();
        opc=sc.next();
        if( null == opc)System.out.println("Ingrese una opción válida");
        else switch (opc) {
                case "1" -> {
                    b.registroPersona("",false);
                    Almacen.Paciente(b.getPaciente(), b.getExpediente());
            }
                case "2" -> {
                    System.out.print("Ingrese el expediente: ");
                    Expediente=sc.next();
                    b.registroPersona(Expediente,true);
                    Almacen.EditarPaciente(b.getPaciente(), b.getExpediente());
            }
                case "3" ->g.showPaciente();
                case "4" -> {
                    System.out.print("Ingrese el expediente: ");
                    Condicional.EliminarTxt(sc.next());
            }
                case "5" -> System.out.println("Usted ha salido");
                default -> System.out.println("Ingrese una opción válida");
            }
        }while(!"5".equals(opc));
    }
}
