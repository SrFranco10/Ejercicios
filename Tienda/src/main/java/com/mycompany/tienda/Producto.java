/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author franc
 */
public class Producto {

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Precio
     */
    public int getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    private String Nombre;
    private int Precio;
    private int Cantidad;
    
    public String toString() {
        return "Lista Producto" + "\n" +
               "Nombre: " + Nombre + "\n" +
               "Cantidad: " + Cantidad + "\n" +
               "Precio: Q" + Precio+"\n"+
                "\n";
    }
    
    
}
