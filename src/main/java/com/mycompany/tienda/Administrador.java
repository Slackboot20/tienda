/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author Camilo
 */
public class Administrador extends Usuario{

    public Administrador(int idUsuario, String Nombre) {
        super(idUsuario, Nombre);
    }
    
    public void gestionarUsuarios(){
        System.out.println(Nombre + " gestionando usuarios");
    }
    
    public void asignarRoles(){
        System.out.println(Nombre + " asignando roles");
    }
    
    public void eliminarUsuarios(){
        System.out.println(Nombre + " eliminando usuarios");
    }
}
