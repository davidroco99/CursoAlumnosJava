
package programacion.clasecursoalumnos;

import programacion.clasecursoalumnos.interfaces.IGUABMCurso;

/**
 *
 * @author david
 */
public class ClaseCursoAlumnos {

    public static void main(String[] args) {
        IGUABMCurso pantallaInicial = IGUABMCurso.getInstance();
        pantallaInicial.setVisible(true);
        pantallaInicial.setLocationRelativeTo(null);
    }
}
