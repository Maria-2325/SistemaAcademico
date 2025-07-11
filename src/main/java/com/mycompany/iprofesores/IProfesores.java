//  @author: William

package com.mycompany.iprofesores;


public interface IProfesores {
    public boolean agregarProfesor(Profesor profesor);
    public boolean actualizarProfesorPorId(int id, Profesor profesor);
    public Profesor buscarProfesorPorId(int id);
    public boolean eliminarProfesor(int id);
    public void imprimirProfesor();
    public Profesor[] obtenerProfesores();
    public Profesor obtenerProfesorPorId(int id);
}