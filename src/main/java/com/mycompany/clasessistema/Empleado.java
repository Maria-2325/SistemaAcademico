package com.mycompany.clasessistema;

public class Empleado extends PersonaInstitucional{
    
    // Atributos 
    private Double sueldo;
    
    // Constructor

    public Empleado(Double sueldo, String correroInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(correroInstitucional, id, nombre, correroPersonal, cedula);
        this.sueldo = sueldo;
    }
    
    //Stters y Getters

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    

 
    @Override
    public String toString() {
        return "Empleado{"+ super.toString() + "sueldo=" + sueldo + '}';
    }

}