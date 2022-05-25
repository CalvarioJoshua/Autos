package com.example.autos;

public class Principal {
    public static void main(String[]args)
    {
        Auto Pasat = new Auto("VW","Deportivo",2020);
        Auto vocho = new Auto("VW","Sedan",2015);
        Auto Tiguan = new Auto ("VW","Camioneta",2018);
        Auto cheyem = new Auto ("Chevrolet","Camioneta",2015);
        Auto Tsuru = new Auto ("Nisan","Sedan",2012);
    }

    Auto[] Lote = new Auto[5];
    Auto [0] = Pasat;
    Auto [1] = vocho;
}
