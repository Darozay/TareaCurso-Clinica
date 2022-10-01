package ui;

import dol.Clinica;
import java.util.Scanner;

public class MenuServicio implements IMenu {
    
    private final Scanner sc=new Scanner(System.in);
    private final Clinica a=new Clinica();
    private String paciente;
    private int deuda;

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
        int cont=0,select;
        String b="",opc;
        OUTER:
        do {
            Menu();
            opc=sc.next();
            System.out.println("_________________________________________________________________________________");
            if (null == opc) {
                System.out.println("Ingrese una opcion valida");
            } else {
                switch (opc) {
                    case "1" -> {
                        System.out.print(a.getPediatria(false)+"Escoja el servicio medico: ");
                        try{
                        select=sc.nextInt();
                        }catch(Exception e){
                        select=-1;
                        }
                        if(select!=6){
                            if(select<1 || select>6){
                                System.out.println("Usted no escogio una opcion valida");
                                break;
                            }
                            cont=cont+a.precioPediatra(select-1);
                            b=b+a.getPediatra(select-1);
                            b=b+"\n";
                        }
                    }
                    case "2" -> {
                        System.out.print(a.getGinecoObstetricia(false)+"Escoja el servicio medico: ");
                        try{
                        select=sc.nextInt();
                        }catch(Exception e){
                        select=-1;
                        }
                        if(select!=7){
                            if(select<1 || select>7){
                                System.out.println("Usted no escogio una opcion valida");
                                break;
                            }
                            cont=cont+a.precioGineco(select-1);
                            b=b+a.getGineco(select-1);
                            b=b+"\n";
                        }
                    }
                    case "3" -> {
                        System.out.print(a.getCardiologia(false)+"Escoja el servicio medico: ");
                        try{
                        select=sc.nextInt();
                        }catch(Exception e){
                        select=-1;
                        }
                        if(select!=6){
                          if(select<1 || select>6){
                              System.out.println("Usted no escogio una opcion valida");
                              break;
                          }  
                            cont=cont+a.precioCardio(select-1);
                            b=b+a.getCardio(select-1);
                            b=b+"\n";
                        }
                    }
                    case "4" -> {
                        System.out.print(a.getDermatologia(false)+"Escoja el servicio medico: ");
                        try{
                        select=sc.nextInt();
                        }catch(Exception e){
                        select=-1;
                        }
                        if(select!=8){
                            if(select<1 || select>8){
                                System.out.println("Usted no escogio una opcion valida");
                                break;
                            }
                            cont=cont+a.precioDerma(select-1);
                            b=b+a.getDerma(select-1);
                            b=b+"\n";
                        }
                    }
                    case "5" -> {
                        System.out.print(a.getGastroenterologia(false)+"Escoja el servicio medico: ");
                        try{
                        select=sc.nextInt();
                        }catch(Exception e){
                        select=-1;
                        }
                        if(select!=6){
                            if(select<1 || select>6){
                                System.out.println("Usted no escogio una opcion valida");
                                break;
                            }
                            cont=cont+a.precioGastro(select-1);
                            b=b+a.getGastro(select-1);
                            b=b+"\n";
                        }
                    }
                    case "6" -> {
                        System.out.print(a.getNeurologia(false)+"Escoja el servicio medico: ");
                        try{
                        select=sc.nextInt();
                        }catch(Exception e){
                        select=-1;
                        }
                        if(select!=8){
                            if(select<1 || select>8){
                                System.out.println("Usted no escogio una opcion valida");
                                break;
                            }
                            cont=cont+a.precioNeuro(select-1);
                            b=b+a.getNeuro(select-1);
                            b=b+"\n";
                        }
                    }
                    case "7" -> {
                        System.out.print(a.getRadiologia(false)+"Escoja el servicio medico: ");
                        try{
                        select=sc.nextInt();
                        }catch(Exception e){
                        select=-1;
                        }
                        if(select!=7){
                            if(select<1 || select>7){
                                System.out.println("Usted no escogio una opcion valida");
                                        break;
                            }
                            cont=cont+a.precioRadio(select-1);
                            b=b+a.getRadio(select-1);
                            b=b+"\n";
                        }
                    }
                    case "8" -> {
                        System.out.println("¡Usted ha regresado al menu principal!");
                        break OUTER;
                    }
                    default -> System.out.println("Ingrese una opcion valida");
                }
            }
            System.out.println("--------------------------------------------------------");
        } while (!"8".equals(opc));
        paciente=b;
        deuda=cont;
    }
    public int getDeuda(){
        return deuda;
    }
    public String getPaciente(){
        return paciente;
    }
}