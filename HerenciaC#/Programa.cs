using System;

public class Programa {
    public static void Main(string[] args) {
        Auto auto = new Auto("ABC123", "Toyota", "Nafta", 4);
        Moto moto = new Moto("XYZ789", "Honda", "Nafta", 250);

        Console.WriteLine("=== AUTO ===");
        auto.MostrarDatos();
        auto.Describir();

        Console.WriteLine("\n=== MOTO ===");
        moto.MostrarDatos();
        moto.Describir();
    }
}
