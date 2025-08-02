public class TestAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota");
auto1.setMarca("Ford");
        auto1.acelerar();             // Llama al método sin parámetros (+10 km/h)
        auto1.acelerar(20);           // Llama al método con int (+20 km/h)
        auto1.acelerar(1.5);          // Llama al método con double (10 * 1.5 = +15 km/h)
    Auto.mostrarCantidadDeRuedas();
    }
}
