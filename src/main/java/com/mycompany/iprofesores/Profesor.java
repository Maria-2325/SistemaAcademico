
package com.mycompany.iprofesores;

import com.mycompany.ClasesSistema.PersonalAcademico;

public class Profesor extends PersonalAcademico{
    // Atributos
    private Escalafon escalafon;

    // Constructor
    public Profesor(String dedicacion, Double sueldo, String correroInstitucional, int id, String nombre, String correroPersonal, String cedula, Escalafon escalafon) {
        super(dedicacion,sueldo, correroInstitucional, id, nombre, correroPersonal, cedula);
        this.escalafon = escalafon;
    }
    // Getters y Setters
    public Escalafon getEscalafon() {
        return escalafon;
    }  
    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }
    // Métodos
    @Override
    public String toString() {
        return "Profesor{" + "escalafon=" + escalafon + '}' + super.toString();
    }
     
    
}
