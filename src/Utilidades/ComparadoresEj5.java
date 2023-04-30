/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.ej5_Pais;
import java.util.Comparator;

public class ComparadoresEj5 {
    
    // mostrar conjunto ordenado alfabeticamente
    
    public static Comparator<ej5_Pais>ordenAZ = new Comparator<ej5_Pais>() {
        @Override
        public int compare(ej5_Pais p1, ej5_Pais p2) {
         return( p1.getPais().compareTo(p2.getPais()));   
        }
    };
    
}
