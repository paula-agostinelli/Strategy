package org.example.ejercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EstrategiaEnvioTest {

    @Test

    public void testEnvioColectivoSur() {
        Envio envio = new Envio(new ColectivoSur());
        Carrito carrito = new Carrito(envio);
        Destino destino = new BuenosAires("Bueno Aires");
        Comprador comprador = new Comprador ("Jose", carrito,destino) ;
        Producto producto = new Producto("Campera", 1500.00, 5.0);
        carrito.agregarProducto(producto);
        assertEquals (2500, comprador.pagar(), 0.1);
    }

    @Test
    public void testEnvioCorreoArgentino() {
        Envio envio = new Envio(new CorreoArgentino());
        Carrito carrito = new Carrito(envio);
        Destino destino = new CapitalFederal ("Capital Federal");
        Comprador comprador = new Comprador ("Jose", carrito,destino) ;
        Producto producto = new Producto("Campera", 1500.00, 5.0);
        carrito.agregarProducto(producto);
        assertEquals (2500, comprador.pagar(), 0.1);
    }
    }
