package org.example.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatoLargo implements FormatoFecha{

    @Override
    public String formatear(LocalDate fecha) {
        return fecha.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("es")));
    }
    }

