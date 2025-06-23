package org.example.ejercicio1;

import java.util.List;

public interface EstrategiaEnvio {
    double costoEnvio (Destino destino, List<Producto> productos);
}

