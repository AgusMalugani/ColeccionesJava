/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class colecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayList<String> bebidas = new ArrayList();
bebidas.add("café");
bebidas.add("té");
Iterator<String> it = bebidas.iterator();
while (it.hasNext()){
if (it.next().equals("café")){
it.remove();
}
    }
    }
}

    

