public class Alumno extends Persona {
    private String carrera;

    public Alumno(String nombre, int edad, String dni, String carrera) {
        super(nombre, edad, dni);
        this.carrera = carrera;
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    @Override
    public void presentarse() {
        System.out.println("Soy un alumno de la carrera: " + carrera);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
    }
}
