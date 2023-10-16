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
public class ClienteDao {
      
    ArrayList<Cliente> lista_clientes;

    public ClienteDao() {
        
        
        lista_clientes = new ArrayList<Cliente>();
        Cliente clie1=new Cliente(0,"12345678A","Jose","Calle pelada","paco@gmail.com","");
        Cliente clie2=new Cliente(1,"00000001A","Maria","Calle pelada","paco@gmail.com","");   
        lista_clientes.add(clie1);
        lista_clientes.add(clie2);
    }

    public ArrayList<Cliente> getLista_clientes() {
        return lista_clientes;
    }

    public void setLista_clientes(ArrayList<Cliente> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }
        
    /**
     * Menu decuelve array lista de los clientes iniciales
     * @return 
     */   
    public ArrayList <Cliente> cargarDatosIniciales(){
      
         return this.lista_clientes;
    }
    /**
    * Añadir artículo a la lista
    */
    public void añadirArticulo(Cliente art){
       this.lista_clientes.add(art);
    }
    public void eliminarRegistro(int i){
       this.lista_clientes.remove(i);
    }
}
