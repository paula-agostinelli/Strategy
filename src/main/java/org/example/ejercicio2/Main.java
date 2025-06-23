package org.example.ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(
                LocalDate.of(1986, 6, 3),
                new FormatoCorto()
        );
        System.out.println("Fecha corta: " + persona.fechaNacimiento());

        persona.setFormatoFecha(new FormatoLargo());
        System.out.println("Fecha larga: " + persona.fechaNacimiento());
    }
}
