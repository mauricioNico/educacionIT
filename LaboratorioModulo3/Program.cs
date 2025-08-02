using System;
using LaboratorioModulo3.Models;

namespace LaboratorioModulo3
{
    class Program
    {
        static void Main(string[] args)
        {
            // Crear estudiantes
            Estudiante estudiante1 = new Estudiante("Mauricio Laurizi", 25, "mlaurizi922@gmail.com");
            Estudiante estudiante2 = new Estudiante("Juan Pérez", 22, "jperez@gmail.com");

            // Crear cursos
            Curso cursoProgramacion = new Curso("Programación en C#", "C#101");
            Curso cursoMatematicas = new Curso("Matemáticas Avanzadas", "MAT202");

            // Inscribir estudiantes en cursos
            cursoProgramacion.InscribirEstudiante(estudiante1);
            cursoProgramacion.InscribirEstudiante(estudiante2);

            cursoMatematicas.InscribirEstudiante(estudiante2);

            // Imprimir estudiantes inscriptos en cada curso
            Console.WriteLine("\nLista de estudiantes en el curso Programación:");
            cursoProgramacion.MostrarEstudiantes();

            Console.WriteLine("\nLista de estudiantes en el curso Matemáticas:");
            cursoMatematicas.MostrarEstudiantes();
        }
    }
}

