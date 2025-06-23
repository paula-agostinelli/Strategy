package org.example.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoCorto implements FormatoFecha{

    @Override
    public String formatear(LocalDate fecha) {
            return fecha.format(DateTimeFormatter.ofPattern("d-MM-yyyy"));
        }
    }

