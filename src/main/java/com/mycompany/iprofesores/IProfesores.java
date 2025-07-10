//  @author: William

package com.mycompany.iprofesores;


public interface IProfesores {
    public boolean agregarProfesor(Profesor profesor);
    public boolean actualizarProfesor(int i, Profesor profesor);
    public void buscarProfesor(int id);
    public boolean eliminarProfesor(int id);
    public void imprimirProfesor();
}