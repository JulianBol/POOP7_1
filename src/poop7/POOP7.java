/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu04
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Julian Bolaños");
        gerente.setNumEmpleado(20100);
        gerente.setPresupuesto(100000);
        System.out.println("Nombre: " + gerente.getNombre());
        System.out.println("Num Empleado: " + gerente.getNumEmpleado());
        System.out.println("Presupuesto: " + gerente.getPresupuesto());
        
        System.out.println(gerente);
    }
    
}
