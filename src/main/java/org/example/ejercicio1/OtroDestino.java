package org.example.ejercicio1;

public class OtroDestino extends Destino{


    public OtroDestino(String nombre) {
        super(nombre);
    }

    @Override
    protected double costoEnvioColectivoSur() {
        return 3000;
    }

    @Override
    protected double costoEnvioCorreoArgentino() {
        return 800;
    }

    @Override
    protected double distanciaACapitalFederal() {
        return 1000;
    }
}
