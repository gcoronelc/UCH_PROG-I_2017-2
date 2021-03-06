package pe.egcc.mifinal.view;

import javax.swing.JInternalFrame;
import pe.egcc.mifinal.model.Usuario;
import pe.egcc.mifinal.util.Memoria;

public class MainView extends javax.swing.JFrame {

  public MainView() {
    initComponents();
    establecerTitulo();
  }

  private void establecerTitulo() {
    Usuario usuario = (Usuario) Memoria.get("usuario");
    String titulo = "TODA MI EXPERIENCIA";
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
    fileMenu = new javax.swing.JMenu();
    ventasMenuItem = new javax.swing.JMenuItem();
    consultasMenuItem = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    exitMenuItem = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    fileMenu.setMnemonic('f');
    fileMenu.setText("File");

    ventasMenuItem.setMnemonic('o');
    ventasMenuItem.setText("Ventas");
    ventasMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ventasMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(ventasMenuItem);

    consultasMenuItem.setMnemonic('s');
    consultasMenuItem.setText("Consultas");
    consultasMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        consultasMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(consultasMenuItem);
    fileMenu.add(jSeparator1);

    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Exit");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(exitMenuItem);

    menuBar.add(fileMenu);

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

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

  private void ventasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasMenuItemActionPerformed
    cargarFormulario(RegistrarView.class);
  }//GEN-LAST:event_ventasMenuItemActionPerformed

  private void consultasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasMenuItemActionPerformed
    cargarFormulario(ConsultaView.class);
  }//GEN-LAST:event_consultasMenuItemActionPerformed

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
  private javax.swing.JMenuItem consultasMenuItem;
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenuItem ventasMenuItem;
  // End of variables declaration//GEN-END:variables

  private void cargarFormulario(Class<?> aClass) {
    try {
      // Variable de control
      JInternalFrame view = null;
      // Buscar formulario
      for (JInternalFrame form : desktopPane.getAllFrames()) {
        if (aClass.isInstance(form)) {
          view = form;
          break;
        }
      }
      // Crear formulario
      if (view == null) {
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
