package pe.egcc.colegioapp.util;

import java.awt.Component;
import javax.swing.JOptionPane;


/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public final class Mensaje {

  /**
   * Constructor privado para que no se puedan crear instancias.
   */
  private Mensaje() {
  }

  public static void showInfo(Component parent, String message) {
    JOptionPane.showMessageDialog(parent, message,
            "GUSTAVO - Info", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void showError(Component parent, String message) {
    JOptionPane.showMessageDialog(parent, message,
            "GUSTAVO - Error", JOptionPane.ERROR_MESSAGE);
  }

}