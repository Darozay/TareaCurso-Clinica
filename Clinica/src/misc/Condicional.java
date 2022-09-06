package misc;

import java.util.ArrayList;

public class Condicional {
    public static String Ordenador(Servicio Array[]){
        String a="";
        int i=0;
        for(Servicio s: Array){
            a=a+Array[i].toString()+"\n";
            i++;
        }
        return a+"servicio "+(Array.length+1)+". Para salir\n";
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
}
