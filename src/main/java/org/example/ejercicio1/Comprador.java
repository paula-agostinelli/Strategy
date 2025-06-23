package org.example.ejercicio1;

public class Comprador {
    private String nombre;
    private Carrito carrito;
    private Destino destino;

    public Comprador(String nombre, Carrito carrito, Destino destino) {
        this.nombre = nombre;
        this.carrito = carrito;
        this.destino= destino;
    }

    public double pagar() {
        return carrito.calcularTotal(destino);
    }
}
