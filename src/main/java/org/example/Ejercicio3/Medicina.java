package org.example.Ejercicio3;

public class Medicina implements Calculador{
    @Override
    public double impuestos() {
        return 0;
    }

    @Override
    public double descuento(double precio) {
        var descuento= 0.0;
        if (precio > 50) {
            descuento = 0.1;
        }
        else {
            descuento = 0.05;
        }
        return descuento;
    }

    @Override
    public boolean envioGratis(double precio) {
        var envioGratis = false;
        if (precio > 200) {
            envioGratis = true;
        }
        return envioGratis;
    }
}
