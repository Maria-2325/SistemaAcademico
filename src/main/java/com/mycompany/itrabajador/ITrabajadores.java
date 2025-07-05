//  @author: Licet

package com.mycompany.itrabajador;

public interface ITrabajadores {

    public boolean agregarTrabajadores(Trabajador trabajador);
    public boolean actualizarTrabajadores(int i, Trabajador trabajador);
    public void buscarTrabajadores(int id); 
    public boolean eliminarTrabajadores(int id);
    public void imprimirTrabajadores();
}