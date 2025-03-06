/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;

/**
 *
 * @author Camilo
 */
public class Tienda {

    public static void main(String[] args) {
        
        Usuario User = new Usuario( 154895, "Ana");
        
        User.Login();
        User.Logout();
        User.updateData();
        
        Administrador Admin = new Administrador(154788, "Andres");
        
        Admin.gestionarUsuarios();
        Admin.asignarRoles();
        Admin.eliminarUsuarios();
        
        Cajero caj = new Cajero(144865, "carlos");
        
        caj.Devoluciones();
        caj.generarFactura();
        caj.registrarVentas();
        
        recursosHumanos RRHH = new recursosHumanos(789456, "daniel");
        
        RRHH.registrarEmpleados();
        RRHH.Nomina();
        RRHH.gestionDePersonal();
        
        Psicologa Psi = new Psicologa(7851236, "daniela");
        
        Psi.evaluarPersonal();
        Psi.informesPsicologicos();
        
        Vendedor Ven = new Vendedor(47951, "jose");
        
        Ven.atencionAlCliente();
        Ven.consultarInventario();
        Ven.realizarVenta();
        
        Contador Con = new Contador(78965241, "camilo");
        
        Con.analisisEstadistico();
        Con.calcularImpuestos();
        Con.generarInforme();
    }
}
