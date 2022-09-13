/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author HP
 */
public class Almacen {
    public static void Paciente(String string,String Archivo){
        File archivo=new File(Archivo+".txt");
        if(!archivo.exists()){
            try{
            archivo.createNewFile();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo+".txt"));
            bw.write(string);
            bw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void EditarPaciente(String string,String Archivo){
        File archivo=new File(Archivo+".txt");
        if(!archivo.exists())System.out.println("No existe el expediente para editar");
        else{
            try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo+".txt"));
            bw.write("");
            bw.close();
            BufferedWriter p = new BufferedWriter(new FileWriter(Archivo+".txt"));
            p.write(string);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
