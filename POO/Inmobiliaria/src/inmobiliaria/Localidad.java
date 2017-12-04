package inmobiliaria;

public class Localidad {

    private String nombre;
    private String codPostal;
    private Long habitantes;

    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    public Localidad(String nombre, String codPostal) {
        this.nombre = nombre;
        this.codPostal = codPostal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codPostal
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * @param codPostal the codPostal to set
     */
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    /**
     * @return the habitantes
     */
    public Long getHabitantes() {
        return habitantes;
    }

    /**
     * @param habitantes the habitantes to set
     */
    public void setHabitantes(Long habitantes) {
        this.habitantes = habitantes;
    }

}
