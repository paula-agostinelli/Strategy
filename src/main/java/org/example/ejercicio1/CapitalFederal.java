package org.example.ejercicio1;


public class CapitalFederal extends Destino{

    public CapitalFederal(String nombre) {
        super("Capital Federal");
    }


    @Override
    protected double costoEnvioColectivoSur() {
        return 1000;
    }

    @Override
    protected double costoEnvioCorreoArgentino() {
        return 500;
    }
    @Override
    protected double distanciaACapitalFederal() {
        return 0.0;
    }
}

