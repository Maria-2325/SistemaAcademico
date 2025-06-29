
package com.mycompany.itrabajador;

import com.mycompany.clasessistema.Empleado;

public class Trabajador extends Empleado{
    
    //Atributos
    private String gremio;
    
    //Constructor

    public Trabajador(String gremio, Double sueldo, String correroInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(sueldo, correroInstitucional, id, nombre, correroPersonal, cedula);
        this.gremio = gremio;
    }
    
    // Setters y Getters

    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }
    
    // Metodos

    @Override
    public String toString() {
        return "PersonalServicio{" + super.toString() + "gremio = " + gremio + '}';
    }
    
     
}
