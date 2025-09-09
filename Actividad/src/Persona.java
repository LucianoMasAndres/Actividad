public class Persona {
    private String nombre;
    private int edad;
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() { return edad; }
    public String getNombre() { return nombre; }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
