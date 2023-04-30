/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ej1_MascotaServicio {

    private Scanner leer = new Scanner(System.in);
    private ArrayList<String> Mascota;

    public ej1_MascotaServicio() {
        this.Mascota = new ArrayList();
        this.leer = new Scanner(System.in);
    }

    // pediremos raza de perros en u bucle y lo guardamos en la lista.
    public void razaPerro() {
        boolean bandera;

        do {
            bandera = false;
            int opcion;

            String resp;

            System.out.println("1 - ingresar raza de perro");
            System.out.println("2 - salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese una raza de perro.");
                    String raza = leer.next();
                    Mascota.add(raza);  // la agregamos a la coleccion.  

                    break;
                case 2:
                    System.out.println("Seguro quiere salir? s/n");
                    resp = leer.next();
                    if (resp.equals("s")) {
                        bandera = true;
                    }

            }

        } while (bandera == false);

        System.out.println("la cantidad de objetos guardados en la coleccion Mascota son : " + Mascota.size());
        for (String aux : Mascota) {
            System.out.println(aux);
        }

    }

    /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     */
    public void mostrarIterator() {
        // se le debe pedir el nombre de un perro
        System.out.println("Ingrese la raza del perro");
        String perro = leer.next();
        // debemos recorrer la lista con el iterator, en caso que este, se debe eliminar el perro 
        // y mostrar la lista ordenada
        Iterator<String> it = Mascota.iterator();
        int cont = 0;
        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equals(perro)) {
                it.remove();
                cont++;
                break;
            }
        }
        if (cont == 0) {
            System.out.println("La raza de perro no se encuentra en la lista.");
        }

        System.out.println("la cantidad de objetos guardados en la coleccion Mascota son : " + Mascota.size());
        Mascota.forEach((aux) -> {
            System.out.println(aux);
        });

    }

}
