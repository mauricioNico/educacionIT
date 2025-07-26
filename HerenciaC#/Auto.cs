public class Auto : Vehiculo {
    public int CantidadPuertas { get; set; }

    public Auto(string patente, string marca, string tipoCombustible, int puertas)
        : base(patente, marca, tipoCombustible) {
        CantidadPuertas = puertas;
    }

    public override void Describir() {
        Console.WriteLine($"Este es un auto con {CantidadPuertas} puertas.");
    }

    public override void MostrarDatos() {
        base.MostrarDatos();
        Console.WriteLine($"Puertas: {CantidadPuertas}");
    }
}
