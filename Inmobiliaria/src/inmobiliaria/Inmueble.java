package inmobiliaria;

public class Inmueble {

    private boolean gasNatural;
    private String calle;
    private String numero;
    private String operacion;
    private Double precio;
    private boolean tieneLuz;
    private String descripcion;
    private Localidad localidad;

    public Inmueble(String calle, String numero, String operacion, Double precio) {
        this.calle = calle;
        this.numero = numero;
        this.operacion = operacion;
        this.precio = precio;
    }

    public Inmueble(String calle, String numero, String operacion, Double precio, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.operacion = operacion;
        this.precio = precio;
        this.localidad = localidad;
    }
    
    public String domicilio() {
        return this.getCalle() + " " + this.getNumero() + ", " + this.getLocalidad().getNombre();
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the operacion
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the localidad
     */
    public Localidad getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the gasNatural
     */
    public boolean isGasNatural() {
        return gasNatural;
    }

    /**
     * @param gasNatural the gasNatural to set
     */
    public void setGasNatural(boolean gasNatural) {
        this.gasNatural = gasNatural;
    }

    /**
     * @return the tieneLuz
     */
    public boolean isTieneLuz() {
        return tieneLuz;
    }

    /**
     * @param tieneLuz the tieneLuz to set
     */
    public void setTieneLuz(boolean tieneLuz) {
        this.tieneLuz = tieneLuz;
    }
}
