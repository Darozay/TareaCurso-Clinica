package main;

import dal.Almacen;
import ui.Opciones;

public class Main {

    public static void main(String[] args) {
        Almacen.Archivador();
        Opciones a=new Opciones();
        a.Manipulador();
    }
}