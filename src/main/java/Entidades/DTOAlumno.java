
package Entidades;


public class DTOAlumno {
    private String nombre;
    private String apellido;
    private String legajo;

    public DTOAlumno() {
    }

    public DTOAlumno(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
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

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "DTOAlumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + '}';
    }

    
}
