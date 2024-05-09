
package Entidades;

import java.util.ArrayList;

public class Curso {
    private String div;
    private String turno;
    ArrayList<Alumno> alumnos;

    public Curso() {
        this.alumnos = new ArrayList<Alumno>();
    }

    public Curso(String div, String turno, ArrayList<Alumno> alumnos) {
        this.div = div;
        this.turno = turno;
        this.alumnos = alumnos;
    }

        
    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    
    @Override
    public String toString() {
        return "Curso{" + "div=" + div + ", turno=" + turno + ", alumnos=" + alumnos + '}';
    }
    
    
    
}
