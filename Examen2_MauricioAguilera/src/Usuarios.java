
import java.util.ArrayList;


public class Usuarios {
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    ArrayList <Libros> predtados = new ArrayList();
    ArrayList <Libros> historial = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(int codigo, String nombre, String apellido, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libros> getPredtados() {
        return predtados;
    }

    public void setPredtados(ArrayList<Libros> predtados) {
        this.predtados = predtados;
    }

    public ArrayList<Libros> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Libros> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", predtados=" + predtados + ", historial=" + historial + '}';
    }

    
    
}
