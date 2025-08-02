namespace LaboratorioModulo3.Models
{
    public class Estudiante
    {
        public string Nombre { get; set; }
        public int Edad { get; set; }
        public string Email { get; set; }

        public Estudiante(string nombre, int edad, string email)
        {
            Nombre = nombre;
            Edad = edad;
            Email = email;
        }
    }
}
