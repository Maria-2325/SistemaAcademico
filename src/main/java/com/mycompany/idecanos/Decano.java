//  @author: William

package com.mycompany.idecanos;

import com.mycompany.clasessistema.PersonalAcademico;
public class Decano extends PersonalAcademico{

    private String nivel;
    
    // constructor
    public Decano(String nivel, String dedicacion, Double sueldo, String correroInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(dedicacion ,sueldo, correroInstitucional, id, nombre, correroPersonal, cedula);
        this.nivel = nivel;
    }
    // Setters y Getters

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
// Metodos
    @Override
    public String toString() {
        return "Decano{" + "nivel=" + nivel + '}' + super.toString();
    }    
    
}