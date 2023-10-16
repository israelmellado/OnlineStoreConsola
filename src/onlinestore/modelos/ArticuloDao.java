/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Israel
 */
public class ArticuloDao {
    
   ArrayList<Articulo> lista_articulos;

    public ArticuloDao() {
        
        lista_articulos = new ArrayList<Articulo>();
        Articulo art1=new Articulo(0,"MM0001","Mesa cuadrada",189.32,3.57,10);
        Articulo art2=new Articulo(1,"MM0002","Mesa Redonda",259.32,3.57,7);   
        lista_articulos.add(art1);
        lista_articulos.add(art2);
        
    }

    public ArrayList<Articulo> getLista_articulos() {
        return lista_articulos;
    }

    public void setLista_articulos(ArrayList<Articulo> lista_articulos) {
        this.lista_articulos = lista_articulos;
    }

    /**
     * Menu decuelve array lista de los artículos iniciales
     * @return 
     */   
    public ArrayList <Articulo> cargarDatosIniciales(){
      
         return this.lista_articulos;
    }

   /**
    * Añadir artículo a la lista
    */
    public void añadirArticulo(Articulo art){
       this.lista_articulos.add(art);
    }
    public void eliminarRegistro(int i){
       this.lista_articulos.remove(i);
    }
}
