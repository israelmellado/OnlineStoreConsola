/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.controlador;

import java.util.ArrayList;
import java.util.Scanner;
import onlinestore.Vista.VistaPedido;
import onlinestore.modelos.Pedido;
import onlinestore.modelos.PedidoDao;

/**
 *
 * @author Israel
 */
public class PedidoControlador {
    
    private Pedido modelo;
    private VistaPedido vista;
    private PedidoDao pediDao=new PedidoDao();
    private ArrayList<Pedido> lista_pedidos;
    
    
    public PedidoControlador(Pedido modelo, VistaPedido vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
     public void actualizarVistaPedidos(){
      
      this.lista_pedidos = this.pediDao.getLista_pedidos();
       for (int i=0;i<lista_pedidos.size();i++) {
            vista.mostrarPedidoDetalles(lista_pedidos.get(i).toString());
             
        }    
   }
    public void añadirRegistroPedido(Scanner sn,ArticuloControlador art,ClienteControlador cli){
        art.actualizarVista();
        System.out.println("selecciona un articulo:");
        int articulo=sn.nextInt();
        cli.actualizarVistaCliente();
        System.out.println("Selecciona un cliente");
        int cliente=sn.nextInt();
        
    }
    
    
}
