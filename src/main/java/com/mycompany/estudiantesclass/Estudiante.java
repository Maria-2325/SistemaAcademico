
package com.mycompany.estudiantesclass;

import com.mycompany.clasessistema.PersonaInstitucional;

public class Estudiante extends PersonaInstitucional{
    
    //Atributos
    private int codigo;
    
    // Constructor 
     public Estudiante(int codigo, String correroInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(correroInstitucional, id, nombre, correroPersonal, cedula);
        this.codigo = codigo;
    }
    
    // Setters y Getters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +super.toString() + "codigo=" + codigo + '}';
    }
    
}
