/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.controlador;

import java.util.ArrayList;
import java.util.Scanner;
import onlinestore.Vista.VistaCliente;
import onlinestore.modelos.Cliente;
import onlinestore.modelos.ClienteDao;

/**
 *
 * @author Israel
 */
public class ClienteControlador {
    
    
    private Cliente modelo;
    private VistaCliente vista;
    private ClienteDao cliDao= new ClienteDao();
    private ArrayList<Cliente> lista_clientes;

    public ClienteControlador(Cliente modelo, VistaCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public Cliente getModelo() {
        return modelo;
    }

    public void setModelo(Cliente modelo) {
        this.modelo = modelo;
    }

    public VistaCliente getVista() {
        return vista;
    }

    public void setVista(VistaCliente vista) {
        this.vista = vista;
    }

    public ClienteDao getCliDao() {
        return cliDao;
    }

    public void setCliDao(ClienteDao cliDao) {
        this.cliDao = cliDao;
    }
    /**
     * 
     */
    public void actualizarVistaCliente(){
     
      this.lista_clientes = this.cliDao.cargarDatosIniciales();
       for (int i=0;i<lista_clientes.size();i++) {
            vista.mostrarClienteDetalles(lista_clientes.get(i).toString());
             
        }    
   }
    /**
     * 
     * @param sc 
     */
    public void eliminarRegistroCliente(Scanner sc){
   
    actualizarVistaCliente();
    System.out.println("Selecciona el Id registro a eliminar: ");
    int cant=sc.nextInt();
    this.cliDao.eliminarRegistro(cant);
  }  
    /**
    * Añadir nuevo artículo a la lista array:
    * @param sc es el sistema consola
    */
   public void añadirRegistroCliente(Scanner sc){
          
       System.out.println("Introduce Nif:  ");
       String dni=sc.next();
       System.out.println("Introduce nombre:   ");
       String nom=sc.next();
       System.out.println("introduce domicilio:   ");
       String dom=sc.next();
       System.out.println("Introducir Email:   ");
       String correo=sc.next();
       System.out.println("Introducir tipo Cliente:     ");
       String tipo=sc.next();
       this.cliDao.añadirArticulo(new Cliente(cliDao.getLista_clientes().size()+1,dni,nom,dom,correo,tipo));
   }
    
}