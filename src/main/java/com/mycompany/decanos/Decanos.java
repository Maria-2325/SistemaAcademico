
package com.mycompany.decanos;
        
public class Decanos {
    Decano[] decano;
    int contador = 0;

    public Decanos(int dimension) {
        decano = new Decano[dimension];
        contador = 0;
    }
    public boolean agregarDecanos(Decano decano) {
        if (contador == this.decano.length) {
            return false;
        } else {
            this.decano[contador] = decano;
            contador++;
            return true;
        }
    }
    public boolean actualizarDecanos(int i, Decano decano) {
        if (i >= 0 && i < contador) {
            this.decano[i] = decano;
            return true;
        } else {
            return false;
        }
    }
    public void buscarDecanos(int id) {
        for (int i = 0; i < contador; i++) {
            if (this.decano[i].getId() == id) {
                System.out.println(this.decano[i]);
                return;
            }
        }
        System.out.println("Decano no encontrado.");
    }

    public boolean eliminarDecanos(int id) {
        if (id >= 0 && id < contador && this.decano[id] != null) {
            this.decano[id] = null;
            return true;
        }
        return false;
    }
    public void imprimirDecanos() {
        for (int i = 0; i < contador; i++) {
            if (i >= 0 && i < contador && this.decano[i] != null) {
                System.out.println("---Datos del Decano-------");
                System.out.println("ID: " + this.decano[i].toString());
                System.out.println("Nivel: " + this.decano[i].getNivel());
                System.out.println("----------------------------");
            }
        }
    }
}
