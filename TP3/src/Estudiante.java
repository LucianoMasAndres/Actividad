public class Estudiante extends Persona {
        private String nombre;
        private int edad;
        private String carrera;
        Estudiante(String nombre, int edad, String carrera){
            super(nombre, edad);
            this.carrera = carrera;
        }
        @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + super.getNombre() + '\'' +
                ", edad=" + super.getEdad() +
                ", carrera='" + carrera + '\'' +
                '}';
    }

}
