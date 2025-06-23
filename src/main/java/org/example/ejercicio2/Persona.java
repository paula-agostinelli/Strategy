package org.example.ejercicio2;

import java.time.LocalDate;

public class Persona {
    private LocalDate fechaNacimiento;
    private FormatoFecha formatoFecha;

    public Persona(LocalDate fechaNacimiento, FormatoFecha formatoFecha) {
        this.fechaNacimiento = fechaNacimiento;
        this.formatoFecha = formatoFecha;
    }

    public String fechaNacimiento() {
        return formatoFecha.formatear(fechaNacimiento);
    }

    public void setFormatoFecha (FormatoFecha formatoFecha) {
        this.formatoFecha = formatoFecha;
    }
}
