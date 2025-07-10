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
    public boolean actualizarEstudiante(int id, Estudiante estudianteActualizado) {
        // BUSCAR POR ID Y ACTUALIZAR
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i] != null && estudiantes[i].getId() == id) {
                this.estudiantes[i] = estudianteActualizado;
                return true;
            }
        }
        return false; // NO ENCONTRADO
    }
    public void buscarEstudiante(int id){

    }

    public boolean eliminarEstudiante(int id) {
        // BUSCAR POR ID Y ELIMINAR CORRECTAMENTE
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i] != null && estudiantes[i].getId() == id) {
                // MOVER TODOS LOS ELEMENTOS HACIA LA IZQUIERDA
                for (int j = i; j < contador - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                estudiantes[contador - 1] = null; // LIMPIAR ÚLTIMA POSICIÓN
                contador--; // DECREMENTAR CONTADOR
                return true;
            }
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

    // MÉTODOS AGREGADOS PARA FUNCIONALIDAD COMPLETA
    public Estudiante[] obtenerEstudiantes() {
        // CREAR UN NUEVO ARRAY SOLO CON LOS ELEMENTOS NO NULOS
        Estudiante[] resultado = new Estudiante[contador];
        int indice = 0;
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i] != null) {
                resultado[indice++] = estudiantes[i];
            }
        }
        return resultado;
    }

    public Estudiante buscarEstudiantePorId(int id) {
        // BUSCAR Y RETORNAR EL ESTUDIANTE POR ID
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i] != null && estudiantes[i].getId() == id) {
                return estudiantes[i];
            }
        }
        return null; // NO ENCONTRADO
    }
}