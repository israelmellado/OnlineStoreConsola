/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.modelos;

import java.util.ArrayList;

/**
 *
 * @author Israel
 */
public class PedidoDao {
   
     ArrayList<Pedido> lista_pedidos;
          public PedidoDao() {
              
              lista_pedidos = new ArrayList<Pedido>();
           }       
        
    public ArrayList<Pedido> getLista_pedidos() {
        return lista_pedidos;
    }

    public void setLista_pedidos(ArrayList<Pedido> lista_pedidos) {
        this.lista_pedidos = lista_pedidos;
    }
    
    public void añadirPedido(Pedido ped){
     this.lista_pedidos.add(ped);
    }
    public void eliminarRegistroPedido(int i){
     this.lista_pedidos.remove(i);
    }
}
