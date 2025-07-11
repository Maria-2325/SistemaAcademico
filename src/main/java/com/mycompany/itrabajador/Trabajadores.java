//  @author: Licet

package com.mycompany.itrabajador;

public class Trabajadores implements ITrabajadores{
 
    Trabajador[] trabajadores;
    int contador;

    // Constructor
    public Trabajadores(int dimension) {
        this.trabajadores = new Trabajador[dimension];
        this.contador = 0;
    }

    // Métodos
    public boolean agregarTrabajador(Trabajador trabajador) {
        if (contador == trabajadores.length) {
            return false;
        } else {
            trabajadores[contador] = trabajador;
            contador++;
            return true;
        }
    }

    public boolean actualizarTrabajadorPorId(int id, Trabajador trabajador) {
        for (int i = 0; i < contador; i++) {
            if (trabajadores[i] != null && trabajadores[i].getId() == id) {
                trabajadores[i] = trabajador;
                return true;
            }
        }
        return false;
    }

    public Trabajador buscarTrabajadorPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (trabajadores[i] != null && trabajadores[i].getId() == id) {
                return trabajadores[i];
            }
        }
        return null;
    }

    public boolean eliminarTrabajador(int id) {
        for (int i = 0; i < contador; i++) {
            if (trabajadores[i] != null && trabajadores[i].getId() == id) {
                // Mover elementos hacia la izquierda
                for (int j = i; j < contador - 1; j++) {
                    trabajadores[j] = trabajadores[j + 1];
                }
                trabajadores[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public void imprimirTrabajador() {
        for (int i = 0; i < contador; i++) {
            if (trabajadores[i] != null) {
                System.out.println(trabajadores[i].toString());
                System.out.println("Gremio: " + trabajadores[i].getGremio());
            }
        }
    }

    public Trabajador[] obtenerTrabajadores() {
        return trabajadores;
    }

    public Trabajador obtenerTrabajadorPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (trabajadores[i] != null && trabajadores[i].getId() == id) {
                return trabajadores[i];
            }
        }
        return null;
    }
}