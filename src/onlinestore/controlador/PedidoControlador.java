/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.controlador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
         /**ARTICULO**/
        System.out.println("selecciona un articulo:");
        art.actualizarVista();
        int articulo=sn.nextInt();
        /*CLIENTE*/
        System.out.println("Selecciona un cliente");
        cli.actualizarVistaCliente();
        int cliente=sn.nextInt();
        /*CANTIDAD*/
        System.out.println("Selecciona un cantidad");
        int cantidad=sn.nextInt();
        /*FECHA*/
        System.out.println("Cuando aceptes se inscribirá la fecha automática");
        Date fechaPedido= new Date();
        Date fechaMañana= new Date();
        System.out.println("Today:    "+fechaPedido);
        Calendar c = Calendar.getInstance();
        c.setTime(fechaPedido);
        c.add(Calendar.DATE, 1);
        fechaMañana = c.getTime();
        System.out.println("Tomorrow: "+fechaMañana);
        //devolver nombre o id registro.
        String articl = art.devolverArticuloCodigo(articulo);
        String client = cli.devolverClienteNombre(cliente);
        //Mostrar Datos seleccionados
        this.vista.registrosComprobarAntesAñadir(articl,client,cantidad,fechaPedido,fechaMañana);
        System.out.println("Si estás de acuerdo pulsa y de lo contrario n :_______  Selecciona (y/n)   ");
        String tipo=sn.next();
        
        if (tipo.equals("y")) {
                if(pediDao.getLista_pedidos().isEmpty()){
                    this.pediDao.añadirPedido(new Pedido(0,
                            art.devolverArticulo(articulo),
                            cli.devolverCliente(cliente),1,fechaPedido));
                }else{
                    this.pediDao.añadirPedido(new Pedido(pediDao.getLista_pedidos().size(),
                            art.devolverArticulo(articulo),
                            cli.devolverCliente(cliente),1,fechaPedido));
                }
                System.out.println("Registro introducido correctamente");
            }else {
              System.out.println("Has decidido no continuar con el registro:");
            }
        
        this.actualizarVistaPedidos();
        
    }
    
    
}
