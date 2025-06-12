package com.mycompany.persona;

public  class Persona {

    // Atributos
    private int id;
    private String nombre;
    private String correroPersonal;
    private String cedula;
    
    // Constructor

    public Persona(int id, String nombre, String correroPersonal, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correroPersonal = correroPersonal;
        this.cedula = cedula;
    }
    


    @Override
    public String toString() {
        return "Persona{" + "id = " + id + ", nombre = " + nombre + ", correroPersonal = " + correroPersonal + ", cedula = " + cedula + '}';
    }
}
