/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.Vista;

import java.util.Date;

/**
 *
 * @author Israel
 */
public class VistaPedido {
      /**
     * 
     * 
     */
     public void mostrarPedidoDetalles(String c){
          System.out.println("Código artcíulos:      "+c);
     }
     
     public void registrosComprobarAntesAñadir(String articulo,String cliente,int cantidad,Date fechaPedido,Date fechaMañana){
     
        System.out.println("Estos son los datos para aceptar:______________________________________________");     
        System.out.println("Articulo Seleccionado          :"+articulo); 
        System.out.println("Cliente Seleccionado           :"+cliente);
        System.out.println("Cantidad Seleccionada          :"+cantidad);
        System.out.println("Cantidad Fecha entrada pedido  :"+fechaPedido);
        System.out.println("tope fecha preparación pedido  :"+fechaMañana);
     }
     
}
