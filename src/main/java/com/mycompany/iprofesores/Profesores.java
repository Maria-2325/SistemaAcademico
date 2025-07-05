package com.mycompany.iprofesores;

import com.mycompany.estudiantesclass.Estudiante;

public class Profesores implements IProfesores {

    Profesor[] profesor;
    int contador = 0;

    public Profesores(int dimension) {
        profesor = new Profesor[dimension];
        contador = 0;
    }


    public boolean agregarProfesores(Profesor profesor) {
        if (contador == this.profesor.length) {
            return false;
        } else {
            this.profesor[contador] = profesor;
            contador++;
            return true;
        }
    }

    public boolean actualizarProfesores(int i, Profesor profesor){
        if (i >= 0 && i < contador) {
            this.profesor[i] = profesor;
            return true;
        } else {
            return false;
        }
    }
    public void buscarProfesores(int id) {
        for (int i = 0; i < contador; i++) {
            if (this.profesor[i].getId() == id) {
                System.out.println(this.profesor[i]);
                return;
            }
        }
        System.out.println("Profesor no encontrado.");

    }
    public boolean eliminarProfesores(int id) {
        if (id >= 0 && id < contador && this.profesor[id] != null) {
            this.profesor[id] = null;
            return true;
        }
        return false;
    }
    public void imprimirProfesores(){
        for (int i = 0; i < contador; i++) {
            if (i >= 0 && i < contador && this.profesor[i] != null) {
                System.out.println("---Datos del Profesor-------");
                System.out.println("ID: " + this.profesor[i].toString());
                System.out.println(this.profesor[i].getEscalafon());
                System.out.println("----------------------------");
            }
        }
    }
}
