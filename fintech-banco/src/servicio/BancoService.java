package servicio;

import modelo.Cliente;
import modelo.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class BancoService {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Cuenta> cuentas = new ArrayList<>();

    public Cliente crearCliente(String nombre, String dni) {
        Cliente cliente = new Cliente(nombre, dni);
        clientes.add(cliente);
        return cliente;
    }

    public Cuenta crearCuentaParaCliente(Cliente cliente) {
        Cuenta cuenta = new Cuenta(cliente);
        cuentas.add(cuenta);
        return cuenta;
    }

    public Cuenta buscarCuenta(int numero) {
        for (Cuenta c : cuentas) {
            if (c.getNumero() == numero) return c;
        }
        return null;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
}
