package com.educacionit;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void testCalcularEdad() {
        Cliente cliente = new Cliente("Ana", "Pérez", LocalDate.now().minusYears(30), "ana@empresa.com");
        assertEquals(30, cliente.calcularEdad());
    }

    @Test
    void testEsMayorDeEdad() {
        Cliente mayor = new Cliente("Luis", "Gómez", LocalDate.of(1990, 1, 1), "luis@gmail.com");
        Cliente menor = new Cliente("Pedro", "Ruiz", LocalDate.now().minusYears(15), "pedro@gmail.com");

        assertTrue(mayor.esMayorDeEdad());
        assertFalse(menor.esMayorDeEdad());
    }

    @Test
    void testPoseeMailEmpresarial() {
        Cliente conMail = new Cliente("Carlos", "Lopez", LocalDate.of(1990, 5, 5), "carlos@empresa.com");
        Cliente sinMail = new Cliente("Sofia", "Diaz", LocalDate.of(1995, 8, 10), "sofia@gmail.com");

        assertTrue(conMail.poseeMailEmpresarial());
        assertFalse(sinMail.poseeMailEmpresarial());
    }

    @Test
    void testConstructorConDatosInvalidos() {
        assertThrows(IllegalArgumentException.class, () ->
            new Cliente(null, "Lopez", LocalDate.of(1990, 1, 1), "mail@empresa.com"));

        assertThrows(IllegalArgumentException.class, () ->
            new Cliente("Juan", "", LocalDate.of(1990, 1, 1), "mail@empresa.com"));

        assertThrows(IllegalArgumentException.class, () ->
            new Cliente("Juan", "Lopez", LocalDate.of(2030, 1, 1), "mail@empresa.com"));

        assertThrows(IllegalArgumentException.class, () ->
            new Cliente("Juan", "Lopez", LocalDate.of(1990, 1, 1), null));
    }
}