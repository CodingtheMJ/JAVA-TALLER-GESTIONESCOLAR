package com;

public class Estudiante {

    private String nombre;
    private int identificacion;
    private double calificacion;


    public Estudiante() {
    }

    public Estudiante(String nombre, int identificacion, double calificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String toString(){
        return  nombre +" "+  identificacion +" "+  calificacion;
    }
}
