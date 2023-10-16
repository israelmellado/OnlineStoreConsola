/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.controlador;

import java.util.ArrayList;
import java.util.Scanner;
import onlinestore.Vista.VistaArticulo;
import onlinestore.modelos.Articulo;
import onlinestore.modelos.ArticuloDao;

/**
 *
 * @author Israel
 */
public class ArticuloControlador {

    private Articulo modelo;
    private VistaArticulo vista;
    private ArticuloDao  artDao=new ArticuloDao();
    private ArrayList<Articulo> lista_articulos;    
    public ArticuloControlador(Articulo modelo, VistaArticulo vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public Articulo getModelo() {
        return modelo;
    }

    public void setModelo(Articulo modelo) {
        this.modelo = modelo;
    }

    public VistaArticulo getVista() {
        return vista;
    }

    public void setVista(VistaArticulo vista) {
        this.vista = vista;
    }
   /**
    * Actualizar la vista artículos:
    */
   public void actualizarVista(){
     
      this.lista_articulos = this.artDao.cargarDatosIniciales();
       for (int i=0;i<lista_articulos.size();i++) {
            vista.mostrarArticuloDetalles(lista_articulos.get(i).toString());
             
        }    
   }
    /**
    * Añadir nuevo artículo a la lista array:
    * @param sc es el sistema consola
    */
   public void añadirRegistro(Scanner sc){
          
       System.out.println("Código:  ");
       String cod=sc.next();
       System.out.println("Descripción:   ");
       String des=sc.next();
       System.out.println("Precio: ");
       Double pre=sc.nextDouble();
       System.out.println("Gastos envío:   ");
       Double gas=sc.nextDouble();
       System.out.println("Cantidad:     ");
       int cant=sc.nextInt();
       this.artDao.añadirArticulo(new Articulo(artDao.getLista_articulos().size()+1,cod,des,pre,gas,cant));
   }
   
  public void eliminarRegistro(Scanner sc){
   
    actualizarVista();
    System.out.println("Selecciona el Id registro a eliminar: ");
    int cant=sc.nextInt();
    this.artDao.eliminarRegistro(cant);
  }  
}
