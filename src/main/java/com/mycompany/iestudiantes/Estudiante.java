//  @author: Licet

package com.mycompany.iestudiantes;

import com.mycompany.clasessistema.PersonaInstitucional;

public class Estudiante extends PersonaInstitucional{
    
    //Atributos
    private int codigo;
    
    // Constructor 
     public Estudiante(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
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