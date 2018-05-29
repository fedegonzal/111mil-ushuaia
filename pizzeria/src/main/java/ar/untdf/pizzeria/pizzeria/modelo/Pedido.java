
package ar.untdf.pizzeria.pizzeria.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Pedido implements Serializable {
    
    @Id
    @Column(name="numero_pedido")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int numero;
    
    @Column(name="fecha_hora_creacion")
    private Date fechaHoraCreacion;
    
    @Column(name="fecha_hora_entrega")
    private Date fechaHoraEntrega;    
    
    @Column(name="nombre_cliente")
    private String nombreCliente;
    
    @ManyToOne
    @JoinColumn(name = "numero_factura")
    private Factura factura;
    
    @ManyToOne
    @JoinColumn(name = "id_estado_pedido")
    private EstadoPedido estado;
    
    @OneToMany(mappedBy = "pedido")
    private List<DetallePedido> detallesPedido;

    /**
     * Constructor por defecto de la clase Pedido
     */
    public Pedido() {
        detallesPedido= new ArrayList();
    }  
    
    
    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase

    public Date getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(Date fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    } 

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder().append("\n Pedido: Fecha Hora Creacion: ");
                retorno.append(fechaHoraCreacion);
                retorno.append(" FechaHoraEntrega: ").append(fechaHoraEntrega);
                retorno.append("\n - N° Pedido: ").append(numero);
                retorno.append("\n - Cliente: ").append(nombreCliente);
                retorno.append(" - Estado: ").append(estado.getNombre());
        
        Iterator<DetallePedido> it = detallesPedido.iterator();
        while(it.hasNext())
        {
            retorno.append("\n");
            DetallePedido detalle = it.next();
            retorno.append(detalle.toString());
        }
        
        return  retorno.toString();
    }
    
}
