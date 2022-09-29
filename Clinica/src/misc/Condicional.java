package misc;
    
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Condicional {
    public static String Ordenador(Servicio Array[],boolean selector){
        String a="";
        int i=0;
        for(Servicio s: Array){
            a=a+Array[i].toString()+"\n";
            i++;
        }
        if(selector==true) return a;
        return a+"Servicio "+(Array.length+1)+". Volver\n";
    }
    public static String Ficha(String string){
        String b="-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n";
        b=b+string+"\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n";
        return b;
    }
    public static String Mostrador(ArrayList<String> a){
        String c="",b="--------------------------------------------------------------------------------------\n";
        int i=0;
        for(String r: a){
            c=(i+1)+".\n"+a+"\n";
            i++;
        }
        return b+c+b;
    }
    public static String MostrarPaciente(ArrayList<String> a,String i){
        String b="--------------------------------------------------------------------------------------\n";
        try{
        return b+a.get(Integer.parseInt(i)-1)+b;
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String ValoresAleatorios(){
        String almacen="";
        for(int i=0;i<8;i++){
            if(i%2==0)almacen=almacen+(int)Math.floor(Math.random()*9);
            else{
                Random a=new Random();
                almacen=almacen+(char)(a.nextInt(26)+'A');
            }
        }
        return almacen;
    }
    public static void MostrarTxt(String string){
        if(".txt".equals(ComprobanteTxt(string))){
        StringBuilder sb=new StringBuilder(string);
        sb.delete(string.length()-4, string.length());
        string=sb.toString();
        }
        String almacen="",a;
        try{
         File archivo=new File(Direccion(),string+".txt");
         BufferedReader bw = new BufferedReader(new FileReader(archivo));
         while((a=bw.readLine())!=null){
             almacen=almacen+a+"\n";
         }
            System.out.println(almacen);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static String Direccion(){
        File Archivo=new File("Archivador");
        return Archivo.getAbsolutePath();
    }
    public static String ComprobanteTxt(String string){
        StringBuilder sb=new StringBuilder(string);
        sb.delete(0, 8);
        return sb.toString();
    }
    public static void EliminarTxt(String string){
        File archivo=new File(Direccion(),string+".txt");
        if(!archivo.exists())System.out.println("El expediente que usted ingresó no existe");
        else{
            archivo.delete();
            System.out.println("Se borró el expediente "+string+" exitosamente");
        }
    }
    
}
