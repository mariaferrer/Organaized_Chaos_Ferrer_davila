/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorganizedchaos;

/**
 *
 * @author mkferrerteran
 */
public class Grafo {
    private int size;
    private int[][] matrizAdyacente;
    
    //Constructor  
    public Grafo(int size){
        this.size = size;
        matrizAdyacente = new int[this.size][this.size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrizAdyacente[i][j] = 0;
            }  
        }
    }
    
}
