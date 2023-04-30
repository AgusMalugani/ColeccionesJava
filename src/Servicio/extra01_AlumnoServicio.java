/*
addAlumno(String nacionalidad)
showAll()
Muestra las distintas nacionalidades y el número de alumnos que existen por nacionalidad.
showNacionalidad(String nacionalidad)
Muestra la nacionalidad y el número de alumnos de esa nacionalidad
cuantos()
Muestra cuántas nacionalidades diferentes existen en el colegio.
borra()

 */
package Servicio;

import Entidad.extra01_Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class extra01_AlumnoServicio {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private extra01_Alumno alumno = new extra01_Alumno();
    private ArrayList <extra01_Alumno> cursoList = new ArrayList();
    
    public void addAlumno(){
     boolean bandera = false;
        do{
        System.out.println("Ingrese el nombre");
        alumno.setNombre(leer.next());
        System.out.println("Ingrese el genero");
        alumno.setGenero(leer.next());
        System.out.println("Ingrese la nacionalidad");
        alumno.setNacionalidad(leer.next());
        extra01_Alumno a = new extra01_Alumno(alumno.getNombre(), alumno.getGenero(), alumno.getNacionalidad());
        cursoList.add(a);
        System.out.println("Quiere cargar otro alumno ? s/n");
        String opcion = leer.next();
        if(opcion.equalsIgnoreCase("n")){
            bandera = true;
        }
        } while (bandera==false);
        
    }
    
    public void muestraNacionalidad(){
        System.out.println("Las nacionalidades que hay en el curso son:" + cursoList.size());
        Iterator <extra01_Alumno> it = cursoList.iterator();
        while (it.hasNext()){
            extra01_Alumno aux = it.next();
            for (extra01_Alumno alumno1 : cursoList) {
                System.out.println(alumno1.getNacionalidad());
            }
       }
        
    }
    
    public void cantidadNacionalidad(){
        System.out.println("Ingrese la nacionalidad");
        String nacio = leer.next();
        int cont = 0;
                Iterator <extra01_Alumno> it = cursoList.iterator();
        while (it.hasNext()){
            extra01_Alumno aux1 = it.next();
        if (nacio.equalsIgnoreCase(aux1.getNacionalidad())){
        cont++;    
        }
    }
        if(cont==0){
            System.out.println("No hay alumnos de esa nacionalidad.");
                   }
        System.out.println("La cantidad de alumnos en la nacionalidad " + nacio + " es : " +cont);
 
    }
    
    public void cuantasNacionalidades(){
        
                        Iterator <extra01_Alumno> it = cursoList.iterator();
                        
    }
    
    
    
    
}
