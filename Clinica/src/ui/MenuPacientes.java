package ui;

import java.io.File;
import java.util.Scanner;
import misc.Condicional;

public class MenuPacientes {

    Scanner sc=new Scanner(System.in);
    
    public MenuPacientes() {
    }
    
    public void Menu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println("1.Ver paciente en especifico\n2.Ver pacientes\n3.salir");
        System.out.print("Escoja la opción deseada: ");
    }

    public void showPaciente() {
        int i;
        String opc="0";
        OUTER:
        while (!"3".equals(opc)) {
            i=0;
            Menu();
            opc=sc.next();
            if (null == opc) {
                System.out.println("Ingrese una opción válida");
            } else {
                switch (opc) {
                    case "1" -> {
                        System.out.print("Ingrese el expediente: ");
                        Condicional.MostrarTxt(sc.next());
                    }
                    case "2" -> {
                        File Archivo=new File(Condicional.Direccion());
                        String[] Txt=Archivo.list();
                        for (String Txt1 : Txt) {
                            if(".txt".equals(Condicional.ComprobanteTxt(Txt[i]))){
                                System.out.println("----------------------------------------------------------------------");
                                Condicional.MostrarTxt(Txt[i]);
                            }
                            i++;
                        }
                    }
                    case "3" -> {
                        System.out.println("Usted esta regresando al menu principal");
                        break OUTER;
                    }
                    default -> System.out.println("Ingrese una opción válida");
                }
            }
        }
    }
    
}
