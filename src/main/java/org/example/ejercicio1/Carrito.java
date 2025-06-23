package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private Envio envio;

    public Carrito(Envio envio){
      this.productos= new ArrayList<>();
      this.envio= envio;
   }
   public void agregarProducto(Producto p){
        this.productos.add(p);
    }

    public double calcularTotal(Destino destino){
        return envio.calcularPrecio(destino,productos);
    }


}

