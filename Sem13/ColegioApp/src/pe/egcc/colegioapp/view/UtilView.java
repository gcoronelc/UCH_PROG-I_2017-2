package pe.egcc.colegioapp.view;

import java.util.List;
import javax.swing.JComboBox;
import pe.egcc.colegioapp.model.Combo;

public final class UtilView {

  private UtilView() {
  }
  
  // Constantes del CRUD
  public static String CRUD_NUEVO = "NUEVO";
  public static String CRUD_EDITAR = "EDITAR";
  public static String CRUD_ELIMINAR = "ELIMINAR";
  
  

  public static void llenarCombo(JComboBox comboBox, List<Combo> items) {
    comboBox.removeAllItems();
    for (Combo item : items) {
      comboBox.addItem(item);
    }
    comboBox.setSelectedIndex(-1);
  }

}
