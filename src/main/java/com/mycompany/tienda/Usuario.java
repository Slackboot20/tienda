/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author Camilo
 */
public class Usuario {
    public int idUsuario;
    public String Nombre;
    public int Cedula;
    public String Contraseña;
    
    public Usuario (int idUsuario, String Nombre){
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.idUsuario = idUsuario;
        this.Contraseña = Contraseña;
    }
    
    public void Login() {
        System.out.println(idUsuario + " " + Nombre + " Ha iniciando sesion");
    }
    
    public void Logout(){
        System.out.println(Nombre + " Ha cerrando sesion");
    }
    
    public void updateData(){
        System.out.println(Nombre + " informacion actualizada");
    }
}
