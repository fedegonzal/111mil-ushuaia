package ar.untdf.pizzeria.pizzeria.modelo;

import java.io.Serializable;
    import java.util.Date;
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
public class Factura implements Serializable {
    
    @Id
    @Column(name="numero_factura")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "fecha_hora_emision")
    private Date fechaHoraEmision;
    
    @ManyToOne
    @JoinColumn(name = "id_estado_factura")
    private EstadoFactura estado;

    /**
     * Constructor por defecto de la clase Factura.
     */
    public Factura() {
    }
    

    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public EstadoFactura getEstado() {
        return estado;
    }

    public void setEstado(EstadoFactura estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.getId() + " - " + this.getFechaHoraEmision() + " - " + this.getEstado().getNombre();
    }
    
    
}
