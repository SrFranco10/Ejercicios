/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blibioteca;

/**
 *
 * @author franc
 */
public class Libro {

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the fechapublicacion
     */
    public int getFechapublicacion() {
        return fechapublicacion;
    }

    /**
     * @param fechapublicacion the fechapublicacion to set
     */
    public void setFechapublicacion(int fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    private String titulo;
    private String autor;
    private int fechapublicacion;
    private double precio;
    
    
    public String toString() {
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Fecha de Publicación: " + fechapublicacion + "\n" +
               "Precio: Q" + precio+"\n"+
                "\n";
    }
}

