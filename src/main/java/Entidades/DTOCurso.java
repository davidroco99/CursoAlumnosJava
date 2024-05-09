
package Entidades;

import java.util.ArrayList;


public class DTOCurso {
    private String div;
    private String turno;
    private ArrayList<DTOAlumno> dtoalumnos;

    public DTOCurso() {
        this.dtoalumnos = new ArrayList<>();
    }

    public DTOCurso(String div, String turno, ArrayList<DTOAlumno> dtoalumnos) {
        this.div = div;
        this.turno = turno;
        this.dtoalumnos = dtoalumnos;
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

    public ArrayList<DTOAlumno> getDtoalumnos() {
        return dtoalumnos;
    }

    public void setDtoalumnos(ArrayList<DTOAlumno> dtoalumnos) {
        this.dtoalumnos = dtoalumnos;
    }

    @Override
    public String toString() {
        return "DTOCurso{" + "div=" + div + ", turno=" + turno + ", dtoalumnos=" + dtoalumnos + '}';
    }

    
}
