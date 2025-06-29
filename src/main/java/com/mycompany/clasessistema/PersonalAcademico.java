
package com.mycompany.clasessistema;
public class PersonalAcademico  extends Empleado{

   // Atributos
    private String dedicacion;
    // Constructor 
   public PersonalAcademico(String dedicacion, Double sueldo, String correroInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(sueldo, correroInstitucional, id, nombre, correroPersonal, cedula);
        this.dedicacion = dedicacion;
    }
     // Metodos
    public String getDedicacion() {
        return dedicacion;
    }
    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    @Override
    public String toString() {
        return "PersonalAcademico{" + '}'+ super.toString();
    }
     
}
