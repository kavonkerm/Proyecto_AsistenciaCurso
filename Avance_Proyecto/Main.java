import java.io.*;
import java.util.*;

public class Main {

  public static void agregarCurso(ArrayList<Cursos> arrayCursos, BufferedReader lector) throws IOException {
    System.out.print("Ingrese el nombre del curso");
    string nombre = lector.readLine();
    System.out.print("Ingrese la cantidad de alumnos que tiene la curso");
    int cant = Integer.parseInt(lector.readLine());
    Cursos cursoaux = new Cursos(nombre,cant);
    arrayCursos.add(cursoaux);
 }

  public static void eliminarCurso(ArrayList<Curso> arrayCursos, String nombreCurso) {
    for (int i = 0; i < arrayCursos.size(); i++) {
      Curso cursoaux = arrayCursos.get(i);
      if (curso.getNombre().equals(nombreCurso)) {
        arrayCursos.remove(i);
        System.out.println("Curso eliminado: " + nombreCurso);
        return;
      }else{
        System.out.println("No se encontró el curso: " + nombreCurso);
      }        
    }
  }

  public static void main(String[] args) throws IOException {

    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    ArrayList arrayCursos = new ArrayList();
        
    while (true) {
      System.out.println("\nMenú:");
      System.out.println("1. Agregar curso");
      System.out.println("2. Eliminar cruso");
      System.out.println("3. Pasar asistencia en un curso");
      System.out.println("4. Mostrar asistencia de un curso");
      System.out.println("5. Salir");
      System.out.print("Selecciona una opción: ");
      int opcion = Integer.parseInt(lector.readLine());
      switch (opcion) {
        case 1:
            agregarCurso(arregloCursos, lector);
            break;
        case 2:
            eliminarCurso(arregloCursos, lector);
            break;
        case 3:
            pasarAsistenciaEnUnCurso(arregloCursos, lector);
            break;
        case 4:
            break;
        default:
            System.out.println("Opción no válida.");
            break;
      }
    }
  } // Fin método main
} // Fin clase
