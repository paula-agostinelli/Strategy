package org.example.Ejercicio3;

public class Libro implements  Calculador{
    @Override
    public double impuestos() {
        return 0.1;
    }

    @Override
    public double descuento(double precio) {
        return 0.1;
    }

    @Override
    public boolean envioGratis(double precio) {
        return false;
    }
}
