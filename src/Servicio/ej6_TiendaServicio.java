/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ej6_Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej6_TiendaServicio {
    ej6_Tienda tienda = new ej6_Tienda();
    Scanner leer = new Scanner(System.in);
    HashMap <String,Integer> conjunto = new HashMap <String,Integer>();
    
    public ej6_Tienda llenarTienda(){
        boolean bandera = false;
        do{
        System.out.println("Ingrese que productos vende");
        tienda.setProducto(leer.next());
        System.out.println("Ingrese la cantidad en stock");
        tienda.setCantidadProducto(leer.nextInt());
        System.out.println("Ingrese el precio por unidad");
        tienda.setPrecio(leer.nextInt());

ej6_Tienda t = new ej6_Tienda(tienda.getProducto(), tienda.getPrecio(), tienda.getCantidadProducto());        
        conjunto.put(t.getProducto(), t.getPrecio());
        
            System.out.println("Quiere cargar otro producto ? s/n");
        String resp = leer.next().toLowerCase();
       // if(resp != "s" ) {//|| resp != "n"){  // si es distinto a s o n, entra al if. Va a correr hasta que sea s o n
       // while((resp != "s") && (resp != "n")){
        //    System.out.println("Ingrese nuevamente la respuesta. s/n");
        //    resp = leer.next().toLowerCase();
       // }
       // }
     // if(resp.equals("s") || resp.equals("n") ){
       //         break;
        //    }
       // }
        
        
       /* if(resp != "s" && resp != "n"){  // si es distinto a s o n, entra al if. Va a correr hasta que sea s o n
            boolean ban = false;
  
            
        }
      */  
        if(resp.equalsIgnoreCase("n")){
            bandera= true;
        }
        }while(bandera == false) ;
        return tienda;
        
    }
    
    public void muestraProducto(){
 System.out.println("En la tienda tenemos un total de : " + conjunto.size() + " productos ");  
        
         System.out.println(" Los productos que vendemos son:" );
         
        for (Map.Entry<String, Integer> aux : conjunto.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println(key + ", precio por unidad : $" + value);
      
            
        }
    }
    
    public HashMap <String,Integer> borrarProducto(){
        
            System.out.println("Que producto quiere eliminar?");
    String borrar = leer.next();
    int cont = 0;
    Iterator<Map.Entry<String, Integer>> iterator = conjunto.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<String, Integer> aux = iterator.next();
        String key = aux.getKey();
        Integer value = aux.getValue();
        if (key.equalsIgnoreCase(borrar)) {
            cont++;
            iterator.remove();
            System.out.println("Se elimino " + key + " de la tienda");
        }
    }
    if (cont == 0) {
        System.out.println("El producto " + borrar + " no se encuentra en la tienda.");
    }
        
        return conjunto;  
        
   /*     
      System.out.println("Que producto quiere eliminar?");
        String borrar = leer.next();
       
        
        int cont = 0;
         for (Map.Entry<String, Integer> aux : conjunto.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            if(key.equalsIgnoreCase(borrar)){
                cont ++;
                System.out.println("Se elimino " + key + " de la tienda");
                 conjunto.remove(borrar);
            }
            
         }
        
         if (cont ==0){
             System.out.println("El producto " + borrar + " no se encuentra en la tienda.");  
         }
 
        return conjunto; 
  
    */    
    }

    
    public ej6_Tienda agregarProducto(){
        System.out.println("Ingrese el nuevo producto");
        String agregar = leer.next();
        System.out.println("Ingrese la cantidad en stock");
        int stock = leer.nextInt();
        System.out.println("Ingrese el precio del producto");
        int precio = leer.nextInt();
        ej6_Tienda n = new ej6_Tienda(agregar, precio, stock);
        conjunto.put(n.getProducto(), n.getPrecio());
         
    return n;
    }
    
    
    public HashMap <String,Integer>  cambiarPrecio(){
        System.out.println("Ingrese el producto que quiere cambiar el precio");
        String cambPrec = leer.next();
        System.out.println("Ingrese el nuevo valor.");
        int nueValor = leer.nextInt();
        int cont = 0;
        for (Map.Entry<String, Integer> aux : conjunto.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            if(cambPrec.equalsIgnoreCase(key)){
                // le cambiamos elvalor de value.
                aux.setValue(nueValor);
                 cont++;
            }

        }
                    if (cont ==0 ){
                System.out.println("No tenemos ese producto en la tienda.");
            
            }
                
return conjunto;
    }
    public void menu(){
        boolean bandera = false;
        do{
        System.out.println("----- MENU -----");
        System.out.println("1- Mostrar productos de la tienda");
        System.out.println("2- Agregar productos");
        System.out.println("3- Eliminar productos");
        System.out.println("4- Cambiar el precio a un producto");
        System.out.println("5- Salir");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1 :    muestraProducto();
            break;
            case 2:     agregarProducto();
            break;
            case 3:     borrarProducto();
            break;
            case 4:     cambiarPrecio();
            break;
            
            case 5: System.out.println("Quiere salir del menu? s/n");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("s")){
                bandera = true;
                
            }
            break;
            
        }
        }while(bandera==false);
    }
    
    
    
    /*
    Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio
    */
    
}
