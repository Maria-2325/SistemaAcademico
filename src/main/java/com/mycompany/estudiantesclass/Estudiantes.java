
package com.mycompany.estudiantesclass;

public class Estudiantes implements IEstudiantes {
    private Estudiante[] estudiantes;
    private int contador = 0;

    public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension];
        contador = 0;
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (contador == estudiantes.length) {
            return false;
        } else {
            estudiantes[contador] = estudiante;
            contador++;
            return true;
        }
    }
}
