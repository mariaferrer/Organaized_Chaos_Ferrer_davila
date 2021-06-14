/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorganizedchaos;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author mkferrerteran
 */
public class listaProductos {
    private NodoLista inicio;
    private NodoLista fin;
    private NodoLista nombre;
    private NodoLista cantidadProducto;
    private NodoLista almacen;
    int Tamanio;

    public listaProductos(){
        this.inicio = null;
        this.fin = null;
        this.Tamanio = 0;
    }  
    
    public boolean esta_vacia(){
        return getInicio() == null;
    }
    
    public void Imprimir(){
        if(!esta_vacia()){
            NodoLista aux = inicio;
            for (int i = 0; i < Tamanio; i++) {
                System.out.println(aux.getData()+"");
                aux = (NodoLista) aux.getSiguiente();
            }
        }else{
            System.out.println("Lista Vacia");
        }
    }
    
    public void mostrar_elementos(){
        if(esta_vacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia.");
        }
        else{
            NodoLista temporal;
            temporal = (NodoLista) getInicio();
            String mostrar_completo = "";
            for (int i=0; i < getTamanio(); i++){
                mostrar_completo += "Nombre: " + temporal.getNombre() + "\n";
                temporal = temporal.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,mostrar_completo);
        }
    } 
    public void agregar_al_final(String nombre, int cantidadProducto, String almacen) {
        NodoLista nuevo  = new NodoLista(nombre, cantidadProducto, almacen);
        if (fin == null && inicio == null) {
            fin = nuevo;
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }  
    
    public void Buscar_Eliminar(String nombre) {
        NodoLista u = inicio;
        while (u != null && u.listaProductos() != nombre){
            u = u.getSiguiente();
        }
        if(u.listaProductos()== nombre){
            NodoLista pre = u.getAnterior();
            NodoLista siguiente = u.getSiguiente();
            if(pre != null){
                siguiente.setAnterior(pre);
            }else{
                inicio = siguiente;
            }
            if(siguiente != null){
                pre.setSiguiente(siguiente);
            }else{
                pre.setSiguiente(null);
            }
             
        }
            
    }

    public NodoLista getFin() {
        return fin;
    }

    public void setFin(NodoLista fin) {
        this.fin = fin;
    }
    
    
    public NodoLista getInicio() {
        return inicio;
    }

    public void setInicio(NodoLista inicio) {
        this.inicio = inicio;
    }

    public NodoLista getNombre() {
        return nombre;
    }

    public void setNombre(NodoLista nombre) {
        this.nombre = nombre;
    }

    public NodoLista getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(NodoLista cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public NodoLista getAlmacen() {
        return almacen;
    }

    public void setAlmacen(NodoLista almacen) {
        this.almacen = almacen;
    }

    public int getTamanio() {
        return Tamanio;
    }

    public void setTamanio(int Tamanio) {
        this.Tamanio = Tamanio;
    }

    public void Buscar_Eliminar(JTextField NombreProductoEliminar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregar_al_final(JTextField AgregarNombre, JTextField AgregarCantidad, JTextField AgregarAlmacen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
   
