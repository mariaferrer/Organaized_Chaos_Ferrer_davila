/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorganizedchaos;

import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {
    
    public void escribir_txt(listaProductos productos) throws FileNotFoundException{
        String productos_archivo = "";
        if (!productos.esta_vacia()){
            NodoLista temp = (NodoLista) productos.getInicio();
                productos_archivo += temp.getNombre() + "," + temp.getCantidadProducto() + "," + temp.getAlmacen() + "\n";
                temp = temp.getSiguiente();
                
        }
        try{
            PrintWriter pw = new PrintWriter("/Users/mkferrerteran/Documents/amazon.txt/amazon.txt/");
            pw.print(productos_archivo);
            pw.close();
        }catch (Exception err){
        }
    }
    
    public listaProductos leer_txt(){ 
        listaProductos productos = new listaProductos();
        String Line;
        String productos_txt = "";
        String path = "/Users/mkferrerteran/Documents/amazon.txt/amazon.txt/";
        File file = new File(path);
        try{
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while((line = br.readLine())  != null){
                    if (!line.isEmpty()){
                        productos_txt += line = "\n";  
                    }
                }
                if (!"".equals(productos_txt)){
                    String[] productos_split = productos_txt.split("\n");
                    for (int i = 0; i < productos_split.length; i++) {
                        String[] producto;
                        producto = productos_split[i].split(",");                        
                    }
                }
                br.close();
            }
               
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al leer los productos.");
        }   
        return (null);
    }
}
