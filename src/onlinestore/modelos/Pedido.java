/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.modelos;

import java.util.Date;

/**
 *
 * @author Israel
 */
public class Pedido {
   /**
    * 
    */
    private int idPedido;
    private Articulo article;
    private Cliente Client;
    private int cantidad;
    private Date fechaPedido;

    public Pedido(int idPedido, Articulo article, Cliente Client, int cantidad, Date fechaPedido) {
        this.idPedido = idPedido;
        this.article = article;
        this.Client = Client;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Articulo getArticle() {
        return article;
    }

    public void setArticle(Articulo article) {
        this.article = article;
    }

    public Cliente getClient() {
        return Client;
    }

    public void setClient(Cliente Client) {
        this.Client = Client;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", article=" + article + ", Client=" + Client + ", cantidad=" + cantidad + ", fechaPedido=" + fechaPedido + '}';
    }
   
    
    
}
