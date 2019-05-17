
import java.util.ArrayList;


public class Usuarios {
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private boolean permiso;
    ArrayList <Libros> prestados = new ArrayList();
    ArrayList <Libros> historial = new ArrayList();

    public Usuarios() {
    }
    
    
    public Usuarios(int codigo, String nombre, String apellido, int edad, boolean permiso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.permiso = permiso;
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

    public boolean isPermiso() {
        return permiso;
    }

    public void setPermiso(boolean permiso) {
        this.permiso = permiso;
    }

    public ArrayList<Libros> getPrestados() {
        return prestados;
    }

    public void setPrestados(ArrayList<Libros> prestados) {
        this.prestados = prestados;
    }
    
    
    public ArrayList<Libros> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Libros> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", predtados=" + prestados + ", historial=" + historial + '}';
    }

    
    
}
