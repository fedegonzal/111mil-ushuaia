package cine.modelo.Pelicula;

import java.util.List;

public interface PeliculaDao {
    
    void crear(Pelicula pelicula);
    void modificar(Pelicula pelicula);
    void eliminar(Pelicula pelicula);
    
    List<Pelicula> listar();
    
    Pelicula buscarPorID(int id);
}
