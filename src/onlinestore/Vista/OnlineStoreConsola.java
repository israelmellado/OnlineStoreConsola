/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinestore.Vista;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import onlinestore.controlador.ArticuloControlador;
import onlinestore.controlador.ClienteControlador;
import onlinestore.modelos.Articulo;
import onlinestore.modelos.Cliente;

/**
 *
 * @author Israel
 */
public class OnlineStoreConsola {
      List<Articulo> lista_articulos=new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       menuPrincipal();
       
       
   // lista_articulos.add(Articulo(0,"MM001","Mesa Cuadrada",125.56,30.0,5));
       
       
       
    }
     
    public static void menuPrincipal(){
    
       Scanner sn = new Scanner(System.in);
       /**
        * Zona Artículo:
        */
       Articulo modelo= new Articulo();
       VistaArticulo vista = new VistaArticulo(); 
       ArticuloControlador controlArt=new ArticuloControlador(modelo,vista);
       Cliente modeloCli = new Cliente();
       VistaCliente vistaCli =new VistaCliente();
       ClienteControlador controlCli=new ClienteControlador(modeloCli,vistaCli);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        while(!salir){
           System.out.println("1. Añadir artículo");
           System.out.println("2. Mostrar artículo");
           System.out.println("3. Eliminar artículo");
           System.out.println("4. Añadir cliente");
           System.out.println("5. Mostrar cliente");
           System.out.println("6. Eliminar cliente");
           System.out.println("10. Salir");
            
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1 -> {
                               
                               System.out.println("Has seleccionado añadir artículo:   -----------");
                               controlArt.añadirRegistro(sn);
                               System.out.println("------------------------------------------------");
                    }
                    case 2 -> {
                               System.out.println("Has seleccionado mostrar artículos: -----------");
                               controlArt.actualizarVista();
                               System.out.println("------------------------------------------------");
                    }
                    case 3 ->{
                               System.out.println("Has seleccionado eliminar la opción artículo");
                               controlArt.eliminarRegistro(sn);
                               System.out.println("------------------------------------------------");
                    }
                    case 4 ->{
                               System.out.println("Has seleccionado añadir Cliente:   -----------");
                               controlCli.añadirRegistroCliente(sn);
                               System.out.println("------------------------------------------------");
                    
                    }
                    case 5 ->{
                               System.out.println("Has seleccionado mostrar Clientes: -----------");
                               controlCli.actualizarVistaCliente();
                               System.out.println("------------------------------------------------");
                                 
                    
                    }
                    case 6 ->{
                               System.out.println("Has seleccionado eliminar Clientes: -----------");
                               controlCli.eliminarRegistroCliente(sn);
                               System.out.println("------------------------------------------------");
                                 
                    
                    }
                    case 10 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
       }
    }
 
 public static void ClearConsole(){
        try{
            //System.out.println("Presione enter para continuar...");
            new java.util.Scanner(System.in).nextLine();

            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_CONTROL);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_CONTROL);
            limpiar.keyRelease(KeyEvent.VK_L);
            
        }  catch (Exception e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
 }
}
