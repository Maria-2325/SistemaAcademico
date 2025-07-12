//  @author: William

package com.mycompany.idecanos;

public interface IDecanos {

    public boolean agregarDecano(Decano decano);
    public boolean actualizarDecano(int i, Decano decano);
    public boolean actualizarDecanoPorId(int id, Decano decano);
    public void buscarDecano(int id);
    public Decano obtenerDecanoPorId(int id);
    public Decano buscarDecanoPorId(int id);
    public Decano[] obtenerDecanos();
    public Decano[] buscarDecanosPorNombre(String nombre);
    public boolean eliminarDecano(int id);
    public void imprimirDecano();
}