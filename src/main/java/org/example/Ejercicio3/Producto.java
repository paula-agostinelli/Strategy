package org.example.Ejercicio3;

public class Producto {
    public Calculador calculador;
    public double precio;
    public Producto(Calculador calculador, double precio) {
        this.calculador=calculador;
        this.precio = precio;
    }
    public double precioFinal() {
        double impuestos = calculador.impuestos();
        double descuentos = calculador.descuento(this.precio);
        boolean envioGratis = calculador.envioGratis(this.precio);
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}
