
package com.mycompany.iprofesores;


public interface IProfesores {
    public boolean agregarProfesores(Profesor profesor);
    public boolean actualizarProfesores(int i, Profesor profesor);
    public void buscarProfesores(int id);
    public boolean eliminarProfesores(int id);
    public void imprimirProfesores();
}
