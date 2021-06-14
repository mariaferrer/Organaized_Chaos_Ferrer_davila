/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorganizedchaos;



import java.io.*;

/**
 *
 * @author mkferrerteran
 */
public class ProyectoOrganizedChaos {

    public static void main(String[] args) throws IOException {
        listaProductos productos = new listaProductos();
        productos.agregar_al_final("Pantalla", 3, "Almacen A");
        productos.agregar_al_final("RAM", 2, "Almacen A");
        productos.agregar_al_final("Procesador", 1, "Almacen A");
        productos.agregar_al_final("Pantalla", 3, "Almacen B");
        productos.agregar_al_final("Grafica", 5, "Almacen B");
        productos.agregar_al_final("Placa", 7, "Almacen C");
        productos.agregar_al_final("Teclado", 8, "Almacen C");
        productos.agregar_al_final("Mouse", 2, "Almacen D");
        productos.agregar_al_final("Microfono", 7, "Almacen E");
        productos.agregar_al_final("Audifonos", 10, "Almacen E");
    }
} 