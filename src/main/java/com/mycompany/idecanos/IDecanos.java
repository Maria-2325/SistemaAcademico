//  @author: William

package com.mycompany.idecanos;

public interface IDecanos {

    public boolean agregarDecano(Decano decano);
    public boolean actualizarDecano(int i, Decano decano);
    public void buscarDecano(int id);
    public boolean eliminarDecano(int id);
    public void imprimirDecano();
}