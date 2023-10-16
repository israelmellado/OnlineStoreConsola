/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.modelos;

/**
 *
 * @author Israel
 */
public class Articulo {
    
    private int idArticulo;
    private String codigo;
    private String descripcion;
    private double precioVenta;
    private double gastosEnvio;
    private int cantidad;

    public Articulo(int idArticulo, String codigo, String descripcion, double precioVenta, double gastosEnvio, int cantidad) {
        this.idArticulo = idArticulo;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.gastosEnvio = gastosEnvio;
        this.cantidad = cantidad;
    }

    public Articulo() {
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Articulo{" + "idArticulo=" + idArticulo + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", gastosEnvio=" + gastosEnvio + ", cantidad=" + cantidad + '}';
    }
    
    
}
