/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author Camilo
 */
public class Cajero extends Usuario{
    
    public Cajero(int idUsuario, String Nombre){
        super(idUsuario, Nombre);
    }
    
    public void registrarVentas(){
        System.out.println("registrando ventas");
    }
    
    public void generarFactura(){
        System.out.println("Generando factura");
    }
    
    public void Devoluciones(){
        System.out.println("Gestionando devoluciones");
    }
}