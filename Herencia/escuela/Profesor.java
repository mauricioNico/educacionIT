public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String dni, String asignatura) {
        super(nombre, edad, dni);
        this.asignatura = asignatura;
    }

    public String getAsignatura() { return asignatura; }
    public void setAsignatura(String asignatura) { this.asignatura = asignatura; }

    @Override
    public void presentarse() {
        System.out.println("Soy profesor de la asignatura: " + asignatura);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Asignatura: " + asignatura);
    }
}
