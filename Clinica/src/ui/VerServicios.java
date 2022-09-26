/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dol.Clinica;
import java.util.Scanner;

/**
 *
 * @author Larry Mendez
 */
public class VerServicios implements IMenu{

    @Override
    public void Menu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println("1. Pediatria");
        System.out.println("2. Gineco Obstetricia");
        System.out.println("3. Cardiologia");
        System.out.println("4. Dermatologia");
        System.out.println("5. Gastroenterologia");
        System.out.println("6. Neurologia");
        System.out.println("7. Radiologia");
        System.out.println("8. Finalizar la cita");
        System.out.print("Escoja la opcion deseada: ");
        
    }

    @Override
    public void showMenu() {
        String opc="";
        Scanner scan =  new Scanner(System.in);
        Clinica p = new Clinica();
        OUTER:
        do{
            Menu();
            opc= scan.next();
            switch(opc){
                case "1" -> System.out.println(p.getPediatria());
                case "2" -> System.out.println(p.getGinecoObstetricia());
                case "3" -> System.out.println(p.getCardiologia());
                case "4" -> System.out.println(p.getDermatologia());
                case "5" -> System.out.println(p.getGastroenterologia());
                case "6" -> System.out.println(p.getNeurologia());
                case "7" -> System.out.println(p.getRadiologia());
                case "8" -> {
                    System.out.println("Ha salido del menu de mostrar servicios");
                    break OUTER;
                }
                    default -> System.out.println("Opcion no valida");
            }
        }while (!"8".equals(opc));

    }
    
}
