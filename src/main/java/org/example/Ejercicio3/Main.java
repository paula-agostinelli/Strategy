package org.example.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        var producto1 = new Producto(new Libro(), 30);
        var producto2 = new Producto(new Medicina(), 50);
        var producto3 = new Producto(new Alimento(), 70);
        var producto4 = new Producto(new Otro(), 100);
        System.out.println(producto1.precioFinal());
        System.out.println(producto2.precioFinal());
        System.out.println(producto3.precioFinal());
        System.out.println(producto4.precioFinal());
    }
}
