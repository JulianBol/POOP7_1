/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu04
 */
public class Empleada {
    private String nombre;
    private int numEmpleado, sueldo;

    public Empleada() {
    }

    public Empleada(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    
    /**
     * 
     * @return Regresa el Nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @return Regresa el numero de empleado 
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int porcentaje) {
        this.sueldo += (int)(sueldo * porcentaje / 100);
    }
    
    /**
     * Mètodo que modifica el valor del nombre
     * @param nombre El nombre de un empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    

    @Override
    public String toString() {
        return "Empleada{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
