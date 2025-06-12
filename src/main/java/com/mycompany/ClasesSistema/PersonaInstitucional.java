
package com.mycompany.ClasesSistema;

import com.mycompany.persona.Persona;


public class PersonaInstitucional extends Persona {
    // Atributos
    private String correroInstitucional;
    
    //Constructor

    public PersonaInstitucional(String correroInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(id, nombre, correroPersonal, cedula);
        this.correroInstitucional = correroInstitucional;
    }

    @Override
    public String toString() {
        return "PersonaInstitucional{" + super.toString() + "correroInstitucional = " + correroInstitucional + '}';
    }
    
    
}
