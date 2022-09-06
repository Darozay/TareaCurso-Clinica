/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.Scanner;
import misc.Condicional;

/**
 *
 * @author HP
 */
public class MenuPacientes {

    Scanner sc=new Scanner(System.in);
    
    public MenuPacientes() {
    }
    
    public void Menu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println("1.Ver pacientes\n2.Ver paciente en especifico\n3.salir");
        System.out.print("Escoja la opción deseada: ");
    }

    public void showPaciente(ArrayList<String> a) {
        String opc;
        do{
            Menu();
            opc=sc.next();
        if( null == opc)System.out.println("Ingrese una opción válida");
        else switch (opc) {
                case "1" -> System.out.println(Condicional.Mostrador(a));
                case "2" -> {
                    System.out.print("Ingrese el paciente: ");
                    System.out.println(Condicional.MostrarPaciente(a, sc.next()));
            }
                case "3" -> System.out.println("Usted esta regreando al menu principal");
                default -> System.out.println("Ingrese una opción válida");
            }
        }while(!"3".equals(opc));
    }
    
}
