public class alumnos {
  
  private string nombre;
  private string apellido;
  private string rut;
  private int rut

  public Cursos(string rut, string nombre,string apellido) {
    this.rut = rut;
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public string getnombre() {
    return nombre;
  }
  public string getApellido() {
    return apellido;
  }
  public int getrut() {
    return rut;
  }
}