
package ar.untdf.pizzeria.pizzeria.vista;

import ar.untdf.pizzeria.pizzeria.modelo.Pedido;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PedidosTableModel extends AbstractTableModel {
    
    private static final String[] COLUMNAS = { "Número", "Fecha", "Hora", "Cliente" };
    
    private final List<Pedido> pedidos;
    private final SimpleDateFormat formatoFecha;
    private final SimpleDateFormat formatoHora;

    public PedidosTableModel(List<Pedido> pedidos) {
        this.pedidos = pedidos;
        
        this.formatoHora  = new SimpleDateFormat("HH:mm");
        this.formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    }
    

    @Override
    public int getRowCount() {
        return this.pedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido p = this.pedidos.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return p.getNumero();
            case 1:
                return formatoFecha.format(p.getFechaHoraCreacion());
            case 2:
                return formatoHora.format(p.getFechaHoraCreacion());
            case 3:
                return p.getNombreCliente();
            default:
                return p.getNumero();
        }
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }
    
    Pedido getPedidoEn(int fila) {
        return this.pedidos.get(fila);
    }   
}
