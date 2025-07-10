//  @author: Licet

package com.mycompany.ipersonasexternas;

import com.mycompany.persona.Persona;

public class PersonaExterna extends Persona {

    // Atributos
    private String descripcion;

    //Constructor

    public PersonaExterna(String descripcion, int id, String nombre, String correroPersonal, String cedula) {
        super(id, nombre, correroPersonal, cedula);
        this.descripcion = descripcion;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
    //Metodos
    @Override
    public String toString() {
        return super.toString();
    }
}