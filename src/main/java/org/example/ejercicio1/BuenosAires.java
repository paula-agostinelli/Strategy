package org.example.ejercicio1;

public class BuenosAires extends  Destino{


    public BuenosAires(String nombre) {
        super("Buenos Aires");
    }

    @Override
    protected double costoEnvioColectivoSur() {
        return 1500;
    }

    @Override
    protected double costoEnvioCorreoArgentino() {
        return 800;
    }

    @Override
    protected double distanciaACapitalFederal() {
        return 20;
    }
}

