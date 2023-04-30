/*

 */
package Entidad;

/*
lase Pelicula con el título, director y duración de la película (en horas).
 */
public class ej4_Pelicula {

    private String nombre;
    private String director;
    private int duracionEnHs;

    public ej4_Pelicula() {
    }

    public ej4_Pelicula(String nombre, String director, int duracionEnHs) {
        this.nombre = nombre;
        this.director = director;
        this.duracionEnHs = duracionEnHs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionEnHs() {
        return duracionEnHs;
    }

    public void setDuracionEnHs(int duracionEnHs) {
        this.duracionEnHs = duracionEnHs;
    }

    @Override
    public String toString() {
        return "ej4_Pelicula{" + "nombre=" + nombre + ", director=" + director + ", duracionEnHs=" + duracionEnHs + '}';
    }
}
