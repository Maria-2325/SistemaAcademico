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

    public boolean actualizarTrabajador(int i, Trabajador trabajador) {
        if (i >= 0 && i < contador) {
            this.trabajadores[i] = trabajador;
            return true;
        } else {
            return false;
        }
    }

    public void buscarTrabajador(int id) {
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (trabajadores[i] != null && trabajadores[i].getId() == id) {
                System.out.println("\nTrabajador encontrado: " + trabajadores[i].toString());
                System.out.println("Gremio: " + trabajadores[i].getGremio());
                System.out.println("-----------------------------------\n");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un trabajador con el ID: " + id);
        }
    }

    public boolean eliminarTrabajador(int id) {
        if (id >= 0 && id < contador && trabajadores[id] != null) {
            trabajadores[id] = null;
            return true;
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

}