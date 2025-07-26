public class Moto : Vehiculo {
    public int Cilindrada { get; set; }

    public Moto(string patente, string marca, string tipoCombustible, int cilindrada)
        : base(patente, marca, tipoCombustible) {
        Cilindrada = cilindrada;
    }

    public override void Describir() {
        Console.WriteLine($"Esta es una moto de {Cilindrada} cc.");
    }

    public override void MostrarDatos() {
        base.MostrarDatos();
        Console.WriteLine($"Cilindrada: {Cilindrada} cc");
    }
}
