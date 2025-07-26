package com.educacionit;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String email;

    public Cliente(String nombre, String apellido, LocalDate fechaNacimiento, String email) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío");
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede ser nulo ni vacío");
        }
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }
        if (fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser futura");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("El email no puede ser nulo ni vacío");
        }

        this.nombre = nombre.trim();
        this.apellido = apellido.trim();
        this.fechaNacimiento = fechaNacimiento;
        this.email = email.trim();
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    public boolean poseeMailEmpresarial() {
        return email.toLowerCase().endsWith("@empresa.com");
    }
}