package dal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import misc.Condicional;

public class Almacen {
    public static void Paciente(String string,String Archivo){
        File archivo =new File(Condicional.Direccion(),Archivo+".txt");
        if(!archivo.exists()){
            try{
            archivo.createNewFile();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(string);
            bw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void EditarPaciente(String string,String Archivo){
        File archivo=new File(Condicional.Direccion(),Archivo+".txt");
        if(!archivo.exists())System.out.println("No existe el expediente para editar");
        else{
            try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("");
            bw.close();
            BufferedWriter p = new BufferedWriter(new FileWriter(archivo));
            p.write(string);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void Archivador(){
        File Almacen=new File("Archivador");
        if(!Almacen.exists()){
        try{
            Almacen.mkdir();
        }catch(Exception e){
            System.out.println(e.getMessage());
    }}
    }
}
