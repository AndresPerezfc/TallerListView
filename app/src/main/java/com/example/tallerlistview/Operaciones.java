package com.example.tallerlistview;

public class Operaciones {

    private int dato1;
    private int dato2;

    private String nombre_operacion;
    private int resultado;

    public Operaciones(String nombre_operacion, int dato1, int resultado){
        this.nombre_operacion = nombre_operacion;
        this.dato1 = dato1;
        this.resultado = resultado;
    }

    public Operaciones(String nombre_operacion, int dato1, int dato2, int resultado){
        this.nombre_operacion = nombre_operacion;
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.resultado = resultado;
    }

    public int getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public int getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public String getNombre_operacion() {
        return nombre_operacion;
    }

    public void setNombre_operacion(String nombre_operacion) {
        this.nombre_operacion = nombre_operacion;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
