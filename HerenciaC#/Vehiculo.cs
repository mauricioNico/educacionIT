public abstract class Vehiculo {
    public string Patente { get; set; }
    public string Marca { get; set; }
    public string TipoCombustible { get; set; }

    public Vehiculo(string patente, string marca, string tipoCombustible) {
        Patente = patente;
        Marca = marca;
        TipoCombustible = tipoCombustible;
    }

    public virtual void MostrarDatos() {
        Console.WriteLine($"Patente: {Patente}");
        Console.WriteLine($"Marca: {Marca}");
        Console.WriteLine($"Combustible: {TipoCombustible}");
    }

    public abstract void Describir();
}
