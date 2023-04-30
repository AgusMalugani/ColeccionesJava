
package Servicio;

import Entidad.ej3_Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;





/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/

public class ej3_AlumnoServicio {
    Scanner leer = new Scanner(System.in);
    ArrayList<ej3_Alumno> alum = new ArrayList< ej3_Alumno >();
 ej3_Alumno persona = new ej3_Alumno();

 public void cargarAlumnos(){
     int opcion;
     boolean bandera = false;
     do{
         
         System.out.println("1- ingresar alumno");
         System.out.println("2- salir");
         opcion = leer.nextInt();
         
     switch(opcion){
         case 1: 
              System.out.println("ingrese el nombre del alumno");
     persona.setNombre(leer.next());
     System.out.println("ingrese la nota del 1er examen");
     persona.setNota1(leer.nextInt());
          System.out.println("ingrese la nota del 2do examen");
     persona.setNota2(leer.nextInt());
          System.out.println("ingrese la nota del 3er examen");
     persona.setNota3(leer.nextInt());
     
     ej3_Alumno p = new ej3_Alumno(persona.getNombre(), persona.getNota1(), persona.getNota2(), persona.getNota3());
     
     alum.add(p);
   
     break;
     
         case 2 : 
             System.out.println("seguro quiere salir ? s/n");
             String resp = leer.next();
             
             if ( resp.equalsIgnoreCase("s")){
                 bandera = true;
             }

     }
     }while(bandera == false);
     System.out.println("la cantidad de alumnos cargados son: " + alum.size());
  //   for (ej3_Alumno aux : alum) {
   //      System.out.println(aux);
   //  }
      
 }
 /*
 Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
 
 public double notaFinal(){
     System.out.println("Ingrese el nombre del alumno");
     String nombreAlum = leer.next();
     
     Iterator<ej3_Alumno> it = alum.iterator();
     // ahora debo crear un while para ver si se puede continuar, y dentro ver si se encuentra el alumno
     int cont = 0; // creo un contador, para ver si entra o no, y alojar un msj
     double nota=0; // para guardar la nota final y retornarla
     
     while(it.hasNext()){
         ej3_Alumno aux = it.next(); // para guardar el alumno en la variable aux.
        
         if(aux.getNombre().equalsIgnoreCase(nombreAlum)){ // llamo por get el nombre del alumno.
             // sumamos las 3 notas y sacamos nota final.
             cont++;
              nota = (aux.getNota1() + aux.getNota2() + aux.getNota3() ) / 3 ;
             System.out.println( aux + " es : " + nota);
             
         }
       
     }
     if(cont == 0){
         System.out.println("no tenemos Alumnos con ese nombre."); 
     }
     
 return nota;
 }
}

 
     
 
 
 
 
 
    
    

