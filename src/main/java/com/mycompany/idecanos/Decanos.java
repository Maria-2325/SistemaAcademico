//  @author: William

package com.mycompany.idecanos;
        
public class Decanos implements IDecanos {
    Decano[] decano;
    int contador = 0;

    public Decanos(int dimension) {
        decano = new Decano[dimension];
        contador = 0;
    }
    public boolean agregarDecano(Decano decano) {
        if (contador == this.decano.length) {
            return false;
        } else {
            this.decano[contador] = decano;
            contador++;
            return true;
        }
    }
    public boolean actualizarDecano(int i, Decano decano) {
        if (i >= 0 && i < contador) {
            this.decano[i] = decano;
            return true;
        } else {
            return false;
        }
    }
    public void buscarDecano(int id) {
        for (int i = 0; i < contador; i++) {
            if (this.decano[i].getId() == id) {
                System.out.println(this.decano[i]);
                return;
            }
        }
        System.out.println("Decano no encontrado.");
    }

    public boolean eliminarDecano(int id) {
        for (int i = 0; i < contador; i++) {
            if (this.decano[i] != null && this.decano[i].getId() == id) {
                // Mover todos los elementos hacia la izquierda
                for (int j = i; j < contador - 1; j++) {
                    this.decano[j] = this.decano[j + 1];
                }
                this.decano[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public boolean actualizarDecanoPorId(int id, Decano decanoActualizado) {
        for (int i = 0; i < contador; i++) {
            if (this.decano[i] != null && this.decano[i].getId() == id) {
                this.decano[i] = decanoActualizado;
                return true;
            }
        }
        return false;
    }

    public Decano obtenerDecanoPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (this.decano[i] != null && this.decano[i].getId() == id) {
                return this.decano[i];
            }
        }
        return null;
    }

    public Decano buscarDecanoPorId(int id) {
        return obtenerDecanoPorId(id);
    }

    public Decano[] obtenerDecanos() {
        Decano[] decanosActivos = new Decano[contador];
        int index = 0;
        for (int i = 0; i < contador; i++) {
            if (this.decano[i] != null) {
                decanosActivos[index] = this.decano[i];
                index++;
            }
        }
        // Crear array del tamaño correcto
        Decano[] resultado = new Decano[index];
        System.arraycopy(decanosActivos, 0, resultado, 0, index);
        return resultado;
    }

    public Decano[] buscarDecanosPorNombre(String nombre) {
        Decano[] decanosEncontrados = new Decano[contador];
        int encontrados = 0;
        
        for (int i = 0; i < contador; i++) {
            if (this.decano[i] != null && 
                this.decano[i].getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                decanosEncontrados[encontrados] = this.decano[i];
                encontrados++;
            }
        }
        
        // Crear array del tamaño correcto
        Decano[] resultado = new Decano[encontrados];
        System.arraycopy(decanosEncontrados, 0, resultado, 0, encontrados);
        return resultado;
    }
    public void imprimirDecano() {
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