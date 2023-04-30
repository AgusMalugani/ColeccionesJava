/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/*
producto, precio, cantidad producto
 */
public class ej6_Tienda {
    private String producto;
    private int precio;
    private int cantidadProducto;

    public ej6_Tienda() {
    }

    public ej6_Tienda(String producto, int precio, int cantidadProducto) {
        this.producto = producto;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "ej6_Tienda{" + "producto=" + producto + ", precio=" + precio + ", cantidadProducto=" + cantidadProducto + '}';
    }
    
    
    
    
}
