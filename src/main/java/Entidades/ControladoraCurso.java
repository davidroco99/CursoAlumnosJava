package Entidades;

import java.util.ArrayList;
/*

    En este archivo se maneja la lógica del caso de uso, tiene la responsabilidad de 
    ser el intermediario entre nuestra lógica de negocio y la interfaz gráfica del 
    usuario.

*/
public class ControladoraCurso {

    private static ControladoraCurso instance = null;
    private Curso curso = new Curso();

    public ControladoraCurso() {
        this.curso.alumnos = new ArrayList<Alumno>();
    }

    public static ControladoraCurso getInstance() {
        if (instance == null) {
            instance = new ControladoraCurso();
        }
        return instance;
    }

    public void agregarAlumno(DTOAlumno dtoAlumno) {

        Alumno alu = new Alumno();
        alu.setNombre(dtoAlumno.getNombre());
        alu.setApellido(dtoAlumno.getApellido());
        alu.setLegajo(Integer.parseInt(dtoAlumno.getLegajo()));

        this.curso.getAlumnos().add(alu);
     
    }

    public void mostrarAlumnos() {
        if (this.curso.getAlumnos() != null) {
            for (Alumno alumno : curso.getAlumnos()) {
                System.out.println("nombre alumno: " + alumno.getNombre() + "; apellido alumno: " + alumno.getApellido() + "; Legajo: " + alumno.getLegajo());

            }
        }

    }

    public DTOCurso traerCurso() {
       DTOCurso dtoCurso = new DTOCurso();
       this.curso.setDiv("Segundo");
       this.curso.setTurno("Noche");
       
       dtoCurso.setDiv(this.curso.getDiv());
       dtoCurso.setTurno(this.curso.getTurno());
                    
       if (curso.getAlumnos() !=null){
            for (Alumno alumno : curso.getAlumnos()){
                DTOAlumno dtoAlumno = new DTOAlumno();
                dtoAlumno.setApellido(alumno.getApellido());
                dtoAlumno.setNombre(alumno.getNombre());
                dtoAlumno.setLegajo(String.valueOf(alumno.getLegajo()));                
                dtoCurso.getDtoalumnos().add(dtoAlumno);
            }
        }
       
       return dtoCurso; 
    }

    public void borrarAlumno(int legajo) {
        Alumno alumnoBorrar = new Alumno();
                
        if (curso.getAlumnos() !=null){
            for (Alumno alumno : curso.getAlumnos()){
                if (alumno.getLegajo()== legajo){
                    System.out.println(alumno.toString());
                    alumnoBorrar = alumno; 
                }        
            }
        }
        curso.getAlumnos().remove(alumnoBorrar);//tiene que ir fuera del bucle porque se está recorriendo el array
    }

    public void modificarAlumno(int legajo, DTOAlumno dtoAlumno) {
        Alumno alumnoBorrar = new Alumno();
        int indice;
        int puntero;
        indice=0;
        puntero= 0;
        
        if (curso.getAlumnos() !=null){
            for (Alumno alumno : curso.getAlumnos()){
                if (alumno.getLegajo()== legajo){
                    System.out.println(alumno.toString());
                    alumnoBorrar = alumno; 
                    puntero = indice;
                }
                indice++;
            }
        }
        curso.getAlumnos().remove(alumnoBorrar);//tiene que ir fuera del bucle porque se está recorriendo el array
         
                
        Alumno alu = new Alumno();
        alu.setNombre(dtoAlumno.getNombre());
        alu.setApellido(dtoAlumno.getApellido());
        alu.setLegajo(Integer.parseInt(dtoAlumno.getLegajo()));

                
        
        curso.getAlumnos().add(puntero,alu);
    }

    public DTOAlumno traerAlumno(int legajo) {
        Alumno alumnoMod = new Alumno();
        if (curso.getAlumnos() !=null){
            for (Alumno alumno : curso.getAlumnos()){
                if (alumno.getLegajo()== legajo){
                    System.out.println(alumno.toString());
                    alumnoMod = alumno; 
                }
         
            }
        }
        
        DTOAlumno dtoAlumno = new DTOAlumno();
        dtoAlumno.setApellido(alumnoMod.getApellido());
        dtoAlumno.setNombre(alumnoMod.getNombre());
        dtoAlumno.setLegajo(String.valueOf(alumnoMod.getLegajo()));                
        return dtoAlumno;        
    }
}
