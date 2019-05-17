
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauri
 */
public class Libros {
    private String autor;
    private String titulo;
    private String genero; 
    private String editorial;
    private String idioma;
    private String ISBN;
    private String estado;
    private String nombre;
    private Date anioescrito;
    private Date anioingresado;
    private int cuenta;

    public Libros() {
    }

    public Libros(String autor, String titulo, String genero, String editorial, String idioma, String ISBN, String estado, String nombre, Date anioescrito, Date anioingresado, int cuenta) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.idioma = idioma;
        this.ISBN = ISBN;
        this.estado = estado;
        this.nombre = nombre;
        this.anioescrito = anioescrito;
        this.anioingresado = anioingresado;
        this.cuenta = cuenta;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getAnioescrito() {
        return anioescrito;
    }

    public void setAnioescrito(Date anioescrito) {
        this.anioescrito = anioescrito;
    }

    public Date getAnioingresado() {
        return anioingresado;
    }

    public void setAnioingresado(Date anioingresado) {
        this.anioingresado = anioingresado;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Libros{" + "autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + ", editorial=" + editorial + ", idioma=" + idioma + ", ISBN=" + ISBN + ", estado=" + estado + ", nombre=" + nombre + ", anioescrito=" + anioescrito + ", anioingresado=" + anioingresado + ", cuenta=" + cuenta + '}';
    }
    
    
}
