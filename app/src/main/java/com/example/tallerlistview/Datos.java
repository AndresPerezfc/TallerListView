package com.example.tallerlistview;

import java.util.ArrayList;

public class Datos {

    private static ArrayList<Operaciones> operaciones = new ArrayList();

    public static void guardar (Operaciones op){
        operaciones.add(op);
    }

    public static ArrayList<Operaciones> obtener(){
        return operaciones;
    }
}
