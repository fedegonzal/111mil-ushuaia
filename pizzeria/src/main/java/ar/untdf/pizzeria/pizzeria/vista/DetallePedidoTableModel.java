
package ar.untdf.pizzeria.pizzeria.vista;

import ar.untdf.pizzeria.pizzeria.modelo.DetallePedido;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DetallePedidoTableModel extends AbstractTableModel {
    
    private static final String[] COLUMNAS = { "Cantidad", "Pizza", "Tipo", "Variedad", "Tamaño", "Precio", "Subtotal" };
    
    private final List<DetallePedido> detalles;

    public DetallePedidoTableModel(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }
    

    @Override
    public int getRowCount() {
        return this.detalles.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DetallePedido d = this.detalles.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return d.getCantidad();
            case 1:
                return d.getPizza();
            case 2:
                return d.getPizza().getTipoPizza();
            case 3:
                return d.getPizza().getVariedad();
            case 4:
                return d.getPizza().getTamanio();
            case 5:
                return d.getPrecio();
            case 6:
                return d.getPrecio();
            default:
                return d.getId();
        }
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }
}
