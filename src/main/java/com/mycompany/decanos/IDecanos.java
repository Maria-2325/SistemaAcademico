
package com.mycompany.decanos;

import com.mycompany.iprofesores.Profesor;

public interface IDecanos {
   public boolean agregarDecanos(Profesor profesor);
    public boolean actualizarDecanos(int i, Profesor profesor);
    public void buscarDecanos(int id);
    public boolean eliminarDecanos(int id);
    public void imprimirDecanos();
}
