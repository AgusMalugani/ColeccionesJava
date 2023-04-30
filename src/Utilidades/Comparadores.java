/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.ej4_Pelicula;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparadores {

    public static Comparator<ej4_Pelicula> compararHsMayorAMenor = new Comparator<ej4_Pelicula>() {
        @Override
        public int compare(ej4_Pelicula p1, ej4_Pelicula p2) {
            return p2.getDuracionEnHs().compareTo(p1.getDuracionEnHs());
        }
    };

    public static Comparator<ej4_Pelicula> compararHsMenorAMayor = new Comparator<ej4_Pelicula>() {
        @Override
        public int compare(ej4_Pelicula p1, ej4_Pelicula p2) {
            return p1.getDuracionEnHs().compareTo(p2.getDuracionEnHs());
        }
    };

    public static Comparator<ej4_Pelicula> ordenarNombreAZ = new Comparator<ej4_Pelicula>() {
        @Override
        public int compare(ej4_Pelicula p1, ej4_Pelicula p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    };

    public static Comparator<ej4_Pelicula> ordenarDirectorAZ = new Comparator<ej4_Pelicula>() {
        @Override
        public int compare(ej4_Pelicula p1, ej4_Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

}
