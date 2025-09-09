public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz");
        Curso curso2 = new Curso("Programación Orientada a Objetos", "Prof. Ana López");

        curso1.agregarEstudiante(new Estudiante("Juan", 20, "Ingeniería en Sistemas"));
        curso1.agregarEstudiante(new Estudiante("María", 22, "Diseño Gráfico"));
        curso1.agregarEstudiante(new Estudiante("Pedro", 21, "Medicina"));

        curso2.agregarEstudiante(new Estudiante("Lucía", 19, "Ingeniería en Sistemas"));
        curso2.agregarEstudiante(new Estudiante("Carlos", 23, "Medicina"));

        // Imprimir cursos
        System.out.println(curso1);
        System.out.println(curso2);
    }
}
