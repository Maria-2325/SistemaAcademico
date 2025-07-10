package com.mycompany.clasessistema;

import com.mycompany.persona.Persona;


public class PersonaInstitucional extends Persona {
    // Atributos
    private String correoInstitucional;
    
    //Constructor

    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    
    @Override
    public String toString() {
        return "PersonaInstitucional{" + super.toString() + "correoInstitucional = " + correoInstitucional + '}';
    }
    
    
}