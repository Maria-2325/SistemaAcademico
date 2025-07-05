
package com.mycompany.estudiantesclass;

public class Estudiantes implements IEstudiantes {

    Estudiante[] estudiantes;
    int contador = 0;

    public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension];
        contador = 0;
    }

    public boolean agregarEstudiantes(Estudiante estudiante) {
        if (contador == estudiantes.length) {
            return false;
        } else {
            estudiantes[contador] = estudiante;
            contador++;
            return true;
        }
    }
    public boolean actualizarEstudiantes(int i, Estudiante estudiantes) {
        if (i >= 0 && i < contador) {
            this.estudiantes[i] = estudiantes;
            return true;
        } else {
            return false;
        }
    }
    public void buscarEstudiantes(int id){

    }

    public boolean eliminarEstudiantes(int i) {
        if (i >= 0 && i < contador && estudiantes[i] != null) {
            estudiantes[i] = null;
            return true;
        }
        return false;
    }
    public void imprimirEstudiantes() {
        for (int i = 0; i < contador; i++) {
            if (i >= 0 && i < contador && estudiantes[i] != null) {
                System.out.println("---Datos del Estudiante-------");
                System.out.println();
            }
        }

    }
}
