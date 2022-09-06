/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author HP
 */
public class Almacen {
    public static void Paciente(String string){
        File archivo=new File("usuario.txt");
        FileWriter escribir;
        PrintWriter linea;
        if(!archivo.exists()){
        try{
            archivo.createNewFile();
            escribir=new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println(string);
            linea.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }else{
            try{
            escribir=new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println(string);
            linea.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void leer(){
        File archivo;
        FileReader leer;
        BufferedReader almacen;
        String cadena;
        archivo=new File("usuario.txt");
        try{
            leer=new FileReader(archivo);
            almacen=new BufferedReader(leer);
            cadena="";
            while(cadena!=null){
                try{
                    cadena=almacen.readLine();
                    if(cadena!=null){
                        System.out.println(cadena);
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
