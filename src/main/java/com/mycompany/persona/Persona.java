package com.mycompany.persona;

public  class Persona {

    // Atributos
    protected int id;
    private String nombre;
    private String correoPersonal;
    private String cedula;
    
    // Constructor

    public Persona(int id, String nombre, String correoPersonal, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correoPersonal = correoPersonal;
        this.cedula = cedula;
    }
    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Id: " + id + "\nNombre: " + nombre + "\nCorreo Personal: " + correoPersonal + "\nCedula: " + cedula ;
    }
}
