//  @author: Licet

package com.mycompany.itrabajador;

public interface ITrabajadores {

    public boolean agregarTrabajador(Trabajador trabajador);
    public boolean actualizarTrabajador(int i, Trabajador trabajador);
    public void buscarTrabajador(int id); 
    public boolean eliminarTrabajador(int id);
    public void imprimirTrabajador();
}