/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;



/**
 *
 * @author Usuario
 */
public class Colecciones {

    /**
     * Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
     */
    public static void main(String[] args) {
   ArrayList<Integer> listado = new ArrayList();
   int x = 5;
   int z = 10;
   int l = 15;
   int o = 20;
   int p = 25;
   
   listado.add(x);  // se ordenan por orden de ingreso.
   listado.add(z);
   listado.add(l);
   listado.add(o);
   listado.add(p);
   
    for(Integer mostrar : listado){
          System.out.println(mostrar);
      }
        System.out.println(" ");
        
   listado.remove(3);
   listado.remove(0);
   
   
   
  
      for(Integer mostrar : listado){
          System.out.println(mostrar);
      }
   

   
   
   
TreeSet<String> nombre = new TreeSet();
   String nom = "agus";
   String nom2 ="cami";
   String nom3 = "juan";
   String nom4 = "marcos";
   String nom5 = "juariu";
   
   nombre.add(nom);
   nombre.add(nom2);
   nombre.add(nom3);
   nombre.add(nom4);
   nombre.add(nom5);
   
   nombre.remove(nom3);


HashMap<Integer,String> alumnos = new HashMap();
int dni1= 123456 ;
String nombre1 = "agustin";

int dni2= 234567;
String nombre2 = "agus";

int dni3= 345687 ;
String nombre3 = "camila" ;

int dni4=  456789;
String nombre4 = "cami" ;

int dni5= 5678941 ;
String nombre5 = "camilaaa" ;

alumnos.put(dni1,nombre1);
alumnos.put(dni2,nombre2);
alumnos.put(dni3,nombre3);
alumnos.put(dni4,nombre4);
alumnos.put(dni5,nombre5);

alumnos.remove(1);
        
    }
    
}
