package com.mycompany.persona;

public class Persona {

    // Atributos
    private int id;
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
  
    // Getters y Setters

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
    
    @Override
    public String toString() {
        return "Id: " + id + "\nNombre: " + nombre + "\nCorreo Personal: " + correoPersonal + "\nCedula: " + cedula ;
    }
}