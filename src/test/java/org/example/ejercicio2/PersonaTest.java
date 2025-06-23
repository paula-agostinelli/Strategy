package org.example.ejercicio2;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonaTest  {

    @Test
    public void testFormatoCorto() {
        Persona persona = new Persona(LocalDate.of(1986, 6, 3), new FormatoCorto());
        assertEquals("3-06-1986", persona.fechaNacimiento());
    }

    @Test
    public void testFormatoLargo() {
        Persona persona = new Persona(LocalDate.of(1986, 6, 3), new FormatoLargo());
        assertEquals("3 de junio de 1986", persona.fechaNacimiento());
    }
  
}