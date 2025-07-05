package com.mycompany.estudiantesclass;

import com.mycompany.personasexternas.PersonaExterna;

public interface IEstudiantes {

    public boolean agregarEstudiantes(Estudiante estudiante);
    public boolean actualizarEstudiantes(int id, Estudiante estudiante);
    public void buscarEstudiantes(int id);
    public boolean eliminarEstudiantes(int id);
    public void imprimirEstudiantes();

}
