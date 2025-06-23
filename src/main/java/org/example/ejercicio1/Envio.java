package org.example.ejercicio1;

import java.util.List;

public class Envio {
    private EstrategiaEnvio envio;

    public Envio(EstrategiaEnvio envio) {
        this.envio = envio;
    }

    public double calcularPrecio(Destino destino, List<Producto> productos)  {
        var costoTotal = 0.0;
        for (Producto p: productos) {
            costoTotal += p.getPrecio();
        }
        costoTotal+= envio.costoEnvio(destino, productos);
        return costoTotal;
    }
}
