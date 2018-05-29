package ar.untdf.pizzeria.pizzeria.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class DetallePedido implements Serializable {
    
    @Id
    @Column(name="id_detalle_pedido")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private int cantidad;
    
    @Column
    private BigDecimal precio;
    
    @ManyToOne
    @JoinColumn(name = "id_pizza")
    private Pizza pizza;
    
    @ManyToOne
    @JoinColumn(name = "id_estado_pedido")
    private EstadoPedido estado;
    
    @ManyToOne
    @JoinColumn(name="numero_pedido")
    private Pedido pedido;
    
    /**
     * Constructor por defecto de la clase DetallePedido.
     */
    public DetallePedido() {
    }
    
    /**
     * Constructor sin atributos referenciales de la clase DetallePedido.
     * @param cantidad
     * @param precio 
     */
    public DetallePedido(int cantidad, BigDecimal precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }
       
    /**
     * Constructor con todos los atributos de la clase DetallePedido.
     * @param cantidad
     * @param precio
     * @param pizza
     * @param estado 
     */
    public DetallePedido(int cantidad, BigDecimal precio, Pizza pizza, EstadoPedido estado) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.pizza = pizza;
        this.estado = estado;
    }
    
    /**
     * Método que calcula el subtotal del pedido, es decir el monto del detalle, que es igual a precio*cantidad.
     * @return BigDecimal
     */
    public BigDecimal calcTotalItem()
    {
       return precio.multiply(new BigDecimal(cantidad));        
    }
    
    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("\n Cantidad: ").append(cantidad).append("\n Precio: ").append(precio).append("Pizza: ").append(pizza.getNombre()).append("\n Estado: ").append(estado.getNombre());
        return sb.toString();
    }
    
}
