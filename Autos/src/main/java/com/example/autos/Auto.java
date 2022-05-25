package com.example.autos;

public class Auto {
    private String marca;
    private String modelo;
    private int año;

    public Auto(String ma, String mo, int a)
    {
        this.marca= ma;
        this.modelo= mo;
        this.año = a;

    }
    public Auto()
    {
        this.marca ="VW";
        this.modelo="Deportivo";
        this.año=2020;
    }
    public String toString()
    {
    String cadena = "\nMarca: " + this.marca +"\nModelo: "+ this.modelo + "\nAño: " + this.año;
    return cadena;
    }


}