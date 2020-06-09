package com.example.tallerlistview;

public class Operaciones {
    private int vlado;
    private int radio;
    private int altura;
    private String nombre_operacion;
    private int resultado;

    public Operaciones(String nombre_operacion, int vlado, int resultado){
        this.nombre_operacion = nombre_operacion;
        this.vlado = vlado;
        this.resultado = resultado;
    }

    public Operaciones(String nombre_operacion, int radio, int altura, int resultado){
        this.nombre_operacion = nombre_operacion;
        this.radio = radio;
        this.altura = altura;
        this.resultado = resultado;
    }

    public int getVlado() {
        return vlado;
    }

    public void setVlado(int vlado) {
        this.vlado = vlado;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
