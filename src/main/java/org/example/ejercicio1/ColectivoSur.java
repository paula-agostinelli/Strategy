package org.example.ejercicio1;

import java.util.List;

public class ColectivoSur implements EstrategiaEnvio{


    @Override
    public double costoEnvio(Destino destino, List<Producto> producto) {
        return  destino.precioColectivoSur(producto);
    }
}
}
