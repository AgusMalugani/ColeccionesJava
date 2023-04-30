/*

 */
package Servicio;

import Entidad.ej4_Pelicula;
import Utilidades.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no. 
 */
public class ej4_PeliculaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // creamos un array para guardar los objetos de las pelis.
    ArrayList<ej4_Pelicula> peliculasList = new ArrayList<ej4_Pelicula>();
    ej4_Pelicula peli = new ej4_Pelicula();

    // creamos el metodo para cargar las pelis y las guardamos en nuestro array.
    public void crearPelicula() {
        boolean bandera = false;
        do {

            System.out.println("Ingrese el nombre de la pelicula");
            peli.setNombre(leer.next());
            System.out.println("Ingrese la duracion en hs");
            peli.setDuracionEnHs(leer.nextInt());
            System.out.println("Ingrese el nombre del Director");
            peli.setDirector(leer.next());

            ej4_Pelicula p = new ej4_Pelicula(peli.getNombre(), peli.getDirector(), peli.getDuracionEnHs());

            peliculasList.add(p);
            System.out.println("quiere salir ? s/n");
            String resp = leer.next();
            if (resp.equals("s")) {
                bandera = true;
            }
        } while (bandera == false);

    }

    // • Mostrar en pantalla todas las películas.
    public void mostrarPeliculas() {
        System.out.println("Las peliculas son: ");
        for (ej4_Pelicula aux : peliculasList) {
            System.out.println(aux);

        }

        System.out.println("tenemos " + peliculasList.size() + " peliculas");
    }

    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void Ordenadas() {
        System.out.println(" ");
        Iterator< ej4_Pelicula> it = peliculasList.iterator();
        System.out.println("Las peliculas con duracion mayor a 1 hora son:");

        while (it.hasNext()) {
            ej4_Pelicula aux = it.next();
            if (aux.getDuracionEnHs() > 1) {
                System.out.println(aux.getNombre());

            }

        }

        // • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
        System.out.println(" ");
        System.out.println("peliculas ordenadas por su duracion, de mayor a menor");
        Collections.sort(peliculasList, Comparadores.compararHsMayorAMenor);
        for (ej4_Pelicula aux : peliculasList) {
            System.out.println(aux);
        }

        //    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
        System.out.println(" "); // le damos un espacio para que no se junte todo.

        System.out.println("Peliculas ordenadas por su duracion de menor a mayor");
        Collections.sort(peliculasList, Comparadores.compararHsMenorAMayor);
        for (ej4_Pelicula aux : peliculasList) {
            System.out.println(aux);

        }
        System.out.println(" "); // espacio
        //• Ordenar las películas por título, alfabéticamente y mostrarlo en pacntalla.
        System.out.println("Peliculas ordenadas por el nombre de A a la Z");
        Collections.sort(peliculasList, Comparadores.ordenarNombreAZ);
        for (ej4_Pelicula aux : peliculasList) {
            System.out.println(aux);
        }

        System.out.println(" ");
        //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
        System.out.println("Peliculas ordenadas por el director de A a la Z");
        Collections.sort(peliculasList, Comparadores.ordenarDirectorAZ);
        for (ej4_Pelicula aux : peliculasList) {
            System.out.println(aux);
        }

    }

}
/*
    
  
      
    
    
    ACA USAMOS CONSTRUCTORES.
    
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora. ++

• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla. ++

    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla. ++

• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.++

• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */

 /*  
   
       
    // ahora usamos collection 
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void Ordenadas(){
        System.out.println("peliculas con duracion mayor a 1 hora");
        Collections.sort(peliculasList, Comparadores.compararHs);
        for (ej4_Pelicula aux : peliculasList) {
            System.out.println(aux);
        }
      
        }
 */
//  int opcion;
// boolean bandera = false;
//do {
//  System.out.println("1- ingresar Pelicula");
// System.out.println("2- salir");
// opcion = leer.nextInt();
//switch (opcion) {
//  case 1:
//     System.out.println("Ingrese el nombre de la pelicula");
//   peli.setNombre(leer.next());
//  System.out.println("Ingrese la duracion en hs");
//  peli.setDuracionEnHs(leer.nextInt());
// System.out.println("Ingrese el nombre del Director");
//peli.setDirector(leer.next());
// peliculasList.add(new ej4_Pelicula());
//    break;
// case 2:
//    System.out.println("seguro quiere salir ? s/n");
//   String resp = leer.next();
//   if (resp.equalsIgnoreCase("s")) {
//      bandera = true;
//  }
//  }
//  } while (bandera == false);
// }
/*
    • Mostrar en pantalla todas las películas.
    
    
    ACA USAMOS CONSTRUCTORES.
    
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
 /*
    public void mostrarPeliculas(){
        System.out.println("Las peliculas son: ");
        for (ej4_Pelicula aux : peliculasList) {
            System.out.println(aux);
            
        }
        
        System.out.println("tenemos " + peliculasList.size() + " peliculas");
    }
    // ahora usamos collection 
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void Ordenadas(){
        System.out.println("peliculas con duracion mayor a 1 hora");
        Collections.sort(peliculasList, Comparadores.compararHs);
        for (ej4_Pelicula aux : peliculasList) {
            System.out.println(aux);
        }
      
        }
 */
//    }
//}

