/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore.modelos;

/**
 *
 * @author Israel
 */
public class Cliente {
     private int idCliente;
     private String nif;
     private String nombre;
     private String domicilio;
     private String email;
     private String tipoCiente_idtipoCiente;

    public Cliente(int idCliente, String nif, String nombre, String domicilio, String email, String tipoCiente_idtipoCiente) {
        this.idCliente = idCliente;
        this.nif = nif;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.tipoCiente_idtipoCiente = tipoCiente_idtipoCiente;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoCiente_idtipoCiente() {
        return tipoCiente_idtipoCiente;
    }

    public void setTipoCiente_idtipoCiente(String tipoCiente_idtipoCiente) {
        this.tipoCiente_idtipoCiente = tipoCiente_idtipoCiente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nif=" + nif + ", nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", tipoCiente_idtipoCiente=" + tipoCiente_idtipoCiente + '}';
    }
     
     
}
