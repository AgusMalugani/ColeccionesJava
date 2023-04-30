
package Entidad;


public class extra01_Alumno {
    private String nombre;
    private String genero;
    private String nacionalidad;

    public extra01_Alumno() {
    }

    public extra01_Alumno(String nombre, String genero, String nacionalidad) {
        this.nombre = nombre;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "extra01_Alumno{" + "nombre=" + nombre + ", genero=" + genero + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
}
