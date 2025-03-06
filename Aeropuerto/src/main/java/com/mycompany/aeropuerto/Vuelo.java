/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author franc
 */
public class Vuelo {
    public String numeroVuelo;
    public String origen;
    public String destino;
    public ArrayList<String> pasajeros;
    
    public Vuelo(String numeroVuelo, String origen, String destino) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = new ArrayList<>();
    }
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public ArrayList<String> getPasajeros() {
        return pasajeros;
    }

    public void agregarPasajero(String pasajero) {
        pasajeros.add(pasajero);
    }

    public boolean buscarPasajero(String nombre) {
        return pasajeros.contains(nombre);
    }
    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(ArrayList<String> pasajeros) {
        this.pasajeros = pasajeros;
    }
    public void mostrarPasajeros(JTextArea textArea) {
        if (pasajeros.isEmpty()) {
            textArea.append("No hay pasajeros en este vuelo.\n");
        } else {
            textArea.append("Pasajeros en el vuelo " + numeroVuelo + ":\n");
            for (String pasajero : pasajeros) {
                textArea.append(pasajero + "\n");
            }
        }
    }
  
    
}
