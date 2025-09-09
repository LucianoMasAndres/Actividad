import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaDeEstudiantes.add(estudiante);
    }

    public int getCantidadAlumnos() {
        return listaDeEstudiantes.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombre).append("\n");
        sb.append("Profesor: ").append(profesor).append("\n");
        sb.append("Cantidad de alumnos: ").append(getCantidadAlumnos()).append("\n");
        sb.append("Lista de Estudiantes:\n");
        for (Estudiante e : listaDeEstudiantes) {
            sb.append("  - ").append(e).append("\n");
        }
        return sb.toString();
    }
}
