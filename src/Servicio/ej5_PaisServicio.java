package Servicio;

import Entidad.ej5_Pais;
import Utilidades.ComparadoresEj5;
import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. 
El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,

si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)++

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.++

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario. ++
 */
public class ej5_PaisServicio {

    ej5_Pais pais = new ej5_Pais();
    Scanner leer = new Scanner(System.in);
    HashSet<ej5_Pais> p = new HashSet<ej5_Pais>();

    public void cargarPais() {
        boolean bandera = false;

        do {
            System.out.println("Ingrese un pais");
            pais.setPais(leer.next());
            ej5_Pais paices = new ej5_Pais(pais.getPais());
            p.add(paices);
            System.out.println("Quiere agregar mas paices? s/n");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("n")) {
                bandera = true;
            }

        } while (bandera == false);

        System.out.println("La cantidad de paices cargados son: " + p.size());

    }

    public void ordenar() {
        System.out.println("Paices ordenados alfabeticamente");
        ArrayList<ej5_Pais> PaicesList = new ArrayList<ej5_Pais>(p); // convierto el set en list para ordenarlo.
        // ahora debemos crear el colletion.
        Collections.sort(PaicesList, ComparadoresEj5.ordenAZ);
        for (ej5_Pais aux : PaicesList) {
            System.out.println(aux);

        }
    }

    public void borrarPais() {

        System.out.println("Ingrese un pais que quiera borrar.");
        String paisBorrado = leer.next();

        Iterator<ej5_Pais> it = p.iterator();
        while (it.hasNext()) {
            ej5_Pais aux = it.next();
            if (aux.getPais().equalsIgnoreCase(paisBorrado)) {
                it.remove();
            }

        }

        System.out.println("La cantidad de paises cargados son : " + p.size());

        for (ej5_Pais aux : p) {
            System.out.println(aux);
        }

    }

}
