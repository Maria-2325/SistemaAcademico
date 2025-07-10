//  @author: Licet

package com.mycompany.iestudiantes;

public interface IEstudiantes {

    public boolean agregarEstudiante(Estudiante estudiante);
    public boolean actualizarEstudiante(int id, Estudiante estudiante);
    public void buscarEstudiante(int id);
    public boolean eliminarEstudiante(int id);
    public void imprimirEstudiante();
    // MÉTODOS AGREGADOS PARA FUNCIONALIDAD COMPLETA
    public Estudiante[] obtenerEstudiantes();
    public Estudiante buscarEstudiantePorId(int id);

}