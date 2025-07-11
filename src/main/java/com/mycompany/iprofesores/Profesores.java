//  @author: William

package com.mycompany.iprofesores;


public class Profesores implements IProfesores {

    Profesor[] profesor;
    int contador = 0;

    public Profesores(int dimension) {
        profesor = new Profesor[dimension];
        contador = 0;
    }


    public boolean agregarProfesor(Profesor profesor) {
        if (contador == this.profesor.length) {
            return false;
        } else {
            this.profesor[contador] = profesor;
            contador++;
            return true;
        }
    }

    public boolean actualizarProfesorPorId(int id, Profesor profesor) {
        for (int i = 0; i < contador; i++) {
            if (this.profesor[i] != null && this.profesor[i].getId() == id) {
                this.profesor[i] = profesor;
                return true;
            }
        }
        return false;
    }

    public Profesor buscarProfesorPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (this.profesor[i] != null && this.profesor[i].getId() == id) {
                return this.profesor[i];
            }
        }
        return null;
    }

    public boolean eliminarProfesor(int id) {
        for (int i = 0; i < contador; i++) {
            if (this.profesor[i] != null && this.profesor[i].getId() == id) {
                // MOVER ELEMENTOS HACIA LA IZQUIERDA
                for (int j = i; j < contador - 1; j++) {
                    this.profesor[j] = this.profesor[j + 1];
                }
                this.profesor[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }
    public void imprimirProfesor(){
        for (int i = 0; i < contador; i++) {
            if (i >= 0 && i < contador && this.profesor[i] != null) {
                System.out.println("---Datos del Profesor-------");
                System.out.println("ID: " + this.profesor[i].toString());
                System.out.println(this.profesor[i].getEscalafon());
                System.out.println("----------------------------");
            }
        }
    }

    public Profesor[] obtenerProfesores() {
        return profesor;
    }

    public Profesor obtenerProfesorPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (this.profesor[i] != null && this.profesor[i].getId() == id) {
                return this.profesor[i];
            }
        }
        return null;
    }
}