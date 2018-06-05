
package ar.untdf.pizzeria.pizzeria.vista;

import ar.untdf.pizzeria.pizzeria.modelo.TamanioPizza;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TamanoPizzaTableModel extends AbstractTableModel {
    
    private static final String[] COLUMNAS = { "Nombre", "Porciones" };
    
    private final List<TamanioPizza> tamanosPizza;

    public TamanoPizzaTableModel(List<TamanioPizza> tamanosPizza) {
        this.tamanosPizza = tamanosPizza;
    }
    

    @Override
    public int getRowCount() {
        return this.tamanosPizza.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TamanioPizza tp = this.tamanosPizza.get(rowIndex);
        
        
        switch (columnIndex) {
            case 0:
                return tp.getNombre();
            case 1:
                return tp.getCantPorciones();
            default:
                return tp.getId();
        }
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }
    
    
    
}
