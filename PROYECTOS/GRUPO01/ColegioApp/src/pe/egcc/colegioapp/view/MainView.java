package pe.egcc.colegioapp.view;

import javax.swing.JInternalFrame;
import pe.egcc.colegioapp.model.Usuario;
import pe.egcc.colegioapp.util.Memoria;

public class MainView extends javax.swing.JFrame {

  public MainView() {
    initComponents();
   this.setExtendedState(MAXIMIZED_BOTH);
    establecerTitulo();
  }

  private void establecerTitulo(){
      Usuario usuario = (Usuario) Memoria.get("usuario");
      String titulo = "SOFTWARE FINANCIERO PARA DE COLEGIOS - FINACOL";
      titulo += " Usuario: " + usuario.getUsuario();
      this.setTitle(titulo);
  }
  
  
  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuProceso = new javax.swing.JMenu();
        menuProcesoProgSeccion = new javax.swing.JMenuItem();
        menuProcesoCuotaIngreso = new javax.swing.JMenuItem();
        menuProcesoAlumno = new javax.swing.JMenuItem();
        menuProcesoMatricula = new javax.swing.JMenuItem();
        menuTablas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuReportes = new javax.swing.JMenu();
        menuUtil = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        menuBar.add(menuArchivo);

        menuProceso.setText("Proceso");

        menuProcesoProgSeccion.setText("Programar Seccion");
        menuProcesoProgSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesoProgSeccionActionPerformed(evt);
            }
        });
        menuProceso.add(menuProcesoProgSeccion);

        menuProcesoCuotaIngreso.setText("Cuota Ingreso");
        menuProcesoCuotaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesoCuotaIngresoActionPerformed(evt);
            }
        });
        menuProceso.add(menuProcesoCuotaIngreso);

        menuProcesoAlumno.setText("Registrar Alumno");
        menuProcesoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesoAlumnoActionPerformed(evt);
            }
        });
        menuProceso.add(menuProcesoAlumno);

        menuProcesoMatricula.setText("Matricula");
        menuProcesoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesoMatriculaActionPerformed(evt);
            }
        });
        menuProceso.add(menuProcesoMatricula);

        menuBar.add(menuProceso);

        menuTablas.setText("Tablas");

        jMenuItem1.setText("jMenuItem1");
        menuTablas.add(jMenuItem1);

        menuBar.add(menuTablas);

        menuConsultas.setText("Consultas");
        menuBar.add(menuConsultas);

        menuReportes.setText("Reportes");
        menuBar.add(menuReportes);

        menuUtil.setText("Util");
        menuBar.add(menuUtil);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuProcesoProgSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesoProgSeccionActionPerformed
        cargarFormulario(ProgramarSeccionView.class);
    }//GEN-LAST:event_menuProcesoProgSeccionActionPerformed

    private void menuProcesoCuotaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesoCuotaIngresoActionPerformed
        cargarFormulario(CuotaIngresoView.class);
    }//GEN-LAST:event_menuProcesoCuotaIngresoActionPerformed

    private void menuProcesoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesoAlumnoActionPerformed
        cargarFormulario(RegistroAumnos.class);
    }//GEN-LAST:event_menuProcesoAlumnoActionPerformed

    private void menuProcesoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesoMatriculaActionPerformed

      cargarFormulario(ProgramarMatricula.class);
    }//GEN-LAST:event_menuProcesoMatriculaActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainView().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuProceso;
    private javax.swing.JMenuItem menuProcesoAlumno;
    private javax.swing.JMenuItem menuProcesoCuotaIngreso;
    private javax.swing.JMenuItem menuProcesoMatricula;
    private javax.swing.JMenuItem menuProcesoProgSeccion;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuTablas;
    private javax.swing.JMenu menuUtil;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario(Class<?> aClass) {
        try {
            // Variable de control
            JInternalFrame view = null;
            // Buscar formulario
            for(JInternalFrame form: desktopPane.getAllFrames()){
                if(aClass.isInstance(form)){
                    view = form;
                    break;
                }
            }
            // Crear formulario
            if( view == null ){
                view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
                desktopPane.add(view);
                view.setVisible(true);
            }
            view.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

}
