
package programacion.clasecursoalumnos.interfaces;

import Entidades.ControladoraCurso;
import Entidades.DTOAlumno;
import Entidades.DTOCurso;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class IGUABMCurso extends javax.swing.JFrame {

    private static IGUABMCurso instance = null;

    public IGUABMCurso() {
        initComponents();
    }
    
    public static IGUABMCurso getInstance() {
        if (instance == null) {
            instance = new IGUABMCurso();
        }
        return instance;
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnAgregarAlumno = new javax.swing.JButton();
        btnModAlumno = new javax.swing.JButton();
        btnEliminarAlumno = new javax.swing.JButton();
        txtNombreCurso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Likhan", 3, 18)); // NOI18N
        jLabel1.setText("Curso: ");

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAlumnos);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgregarAlumno.setText("Agregar Alumno");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });

        btnModAlumno.setText("Modificar Alumno");
        btnModAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModAlumnoActionPerformed(evt);
            }
        });

        btnEliminarAlumno.setText("Eliminar Alumno");
        btnEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumnoActionPerformed(evt);
            }
        });

        txtNombreCurso.setFont(new java.awt.Font("Likhan", 3, 18)); // NOI18N
        txtNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnAgregarAlumno)
                .addGap(18, 18, 18)
                .addComponent(btnModAlumno)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModAlumnoActionPerformed
        if (jTableAlumnos.getRowCount() > 0) {
            //hay por lo menos una selección
            if (jTableAlumnos.getSelectedRow() != -1) {
                //optengo la id a borrar
                int legajo = Integer.parseInt(String.valueOf(jTableAlumnos.getValueAt(jTableAlumnos.getSelectedRow(), 2)));
                
                IGUModificarAlumno pantallaModificarAlumno = IGUModificarAlumno.getInstance();
                pantallaModificarAlumno.modificarAlumno(legajo);
                pantallaModificarAlumno.setVisible(true);
                pantallaModificarAlumno.setLocationRelativeTo(null);
                
            }
            else{
                mostrarMensajes("No Seleccionó ningún Alumno","Error", "No se modificó el registro");
            }
        }
        else{
            mostrarMensajes("No hay registros para modificar","Error", "No se modificó el registro");
        }
        cargarTabla();                                          
                    
    }//GEN-LAST:event_btnModAlumnoActionPerformed

    private void txtNombreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCursoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        IGUAltaAlumno pantallaAltaAlumno = IGUAltaAlumno.getInstance();
        pantallaAltaAlumno.setVisible(true);
        pantallaAltaAlumno.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        cargarTabla();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumnoActionPerformed
         
        if (jTableAlumnos.getRowCount() > 0) {
            //hay por lo menos una selección
            if (jTableAlumnos.getSelectedRow() != -1) {
                //optengo la id a borrar
                int legajo = Integer.parseInt(String.valueOf(jTableAlumnos.getValueAt(jTableAlumnos.getSelectedRow(), 2)));
                //borrar el alumno
                ControladoraCurso controladora = ControladoraCurso.getInstance();
                controladora.borrarAlumno(legajo);
                mostrarMensajes("Se Eliminó correctamente El Alumno","Info", "Eliminación Exitosa");               
            }
            else{
                mostrarMensajes("No Seleccionó ningún Alumno","Error", "No se elimnó el registro");
            }
        }
        else{
            mostrarMensajes("No hay registros para eliminar","Error", "No se elimnó el registro");
        }
        
        cargarTabla();                                          
            
    }//GEN-LAST:event_btnEliminarAlumnoActionPerformed

    public void cargarTabla(){
        DTOCurso dtoCurso;
        dtoCurso = new DTOCurso();
        ControladoraCurso controladora = ControladoraCurso.getInstance();
        dtoCurso = controladora.traerCurso();
        
        txtNombreCurso.setText(dtoCurso.getDiv()+" "+dtoCurso.getTurno());
        
        DefaultTableModel tabla = new DefaultTableModel(){
            
            //filas y columnas no editables
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        //establecer nombre y columnas
        
        String titulos[] = {"Nombre", "Apellido","Legajo"};
        tabla.setColumnIdentifiers(titulos);
        
        /*
        //recorrer la lista y mostrar cada uno de llos elementos en la tabla
        */
        if (dtoCurso.getDtoalumnos() !=null){
            for (DTOAlumno dtoAlumno : dtoCurso.getDtoalumnos()){
                Object[] objeto = {dtoAlumno.getNombre(),dtoAlumno.getApellido(),dtoAlumno.getLegajo()};
                tabla.addRow(objeto);
            }
        }
        
        jTableAlumnos.setModel(tabla);
    }
    
    public void mostrarMensajes(String mensaje, String tipo,String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnEliminarAlumno;
    private javax.swing.JButton btnModAlumno;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField txtNombreCurso;
    // End of variables declaration//GEN-END:variables
}
