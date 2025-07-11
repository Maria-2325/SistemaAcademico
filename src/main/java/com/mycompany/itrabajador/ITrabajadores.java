//  @author: Licet

package com.mycompany.itrabajador;

public interface ITrabajadores {

    public boolean agregarTrabajador(Trabajador trabajador);
    public boolean actualizarTrabajadorPorId(int id, Trabajador trabajador);
    public Trabajador buscarTrabajadorPorId(int id); 
    public boolean eliminarTrabajador(int id);
    public void imprimirTrabajador();
    public Trabajador[] obtenerTrabajadores();
    public Trabajador obtenerTrabajadorPorId(int id);
}