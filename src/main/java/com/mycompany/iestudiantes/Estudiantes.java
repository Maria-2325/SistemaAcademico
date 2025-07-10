//  @author: Licet

package com.mycompany.iestudiantes;

public class Estudiantes implements IEstudiantes {

    Estudiante[] estudiantes;
    int contador = 0;

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
    public boolean actualizarEstudiante(int i, Estudiante estudiantes) {
        if (i >= 0 && i < contador) {
            this.estudiantes[i] = estudiantes;
            return true;
        } else {
            return false;
        }
    }
    public void buscarEstudiante(int id){

    }

    public boolean eliminarEstudiante(int i) {
        if (i >= 0 && i < contador && estudiantes[i] != null) {
            estudiantes[i] = null;
            return true;
        }
        return false;
    }
    public void imprimirEstudiante() {
        for (int i = 0; i < contador; i++) {
            if (i >= 0 && i < contador && estudiantes[i] != null) {
                System.out.println("---Datos del Estudiante-------");
                System.out.println(estudiantes[i].toString());
                System.out.println("Codigo"+ estudiantes[i].getCodigo());
            }
        }

    }
}