using System;
using System.Collections.Generic;

namespace LaboratorioModulo3.Models
{
    public class Curso
    {
        public string Nombre { get; set; }
        public string CodigoCurso { get; set; }
        private List<Estudiante> estudiantes;

        public Curso(string nombre, string codigoCurso)
        {
            Nombre = nombre;
            CodigoCurso = codigoCurso;
            estudiantes = new List<Estudiante>();
        }

        public void InscribirEstudiante(Estudiante estudiante)
        {
            estudiantes.Add(estudiante);
            Console.WriteLine($"Estudiante {estudiante.Nombre} inscrito al curso {Nombre}.");
        }

        public List<Estudiante> ObtenerEstudiantes()
        {
            return estudiantes;
        }

        public void MostrarEstudiantes()
        {
            Console.WriteLine($"Estudiantes en el curso {Nombre}:");
            foreach (var est in estudiantes)
            {
                Console.WriteLine($"- {est.Nombre} ({est.Email})");
            }
        }
    }
}
