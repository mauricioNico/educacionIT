using System;

class Saludo
{
    static void Main()
    {
        // Preguntar el nombre al usuario
        Console.Write("¿Cómo te llamás? ");
        string nombre = Console.ReadLine();

        // Mostrar el saludo personalizado
        Console.WriteLine("¡Hola, " + nombre + "! ¡Un gusto saludarte!");
    }
}
