package com.mycompany.personasexternas;

public interface IPersonasExternas {

    public boolean agregarPersonasExternas(PersonaExterna personaExterna);
    public boolean actualizarPersonasExternas(int id, PersonaExterna personaExterna);
    public void buscarPersonasExternas(int id);
    public boolean eliminarPersonasExternas(int id);
    public void imprimirPersonasExternas();
    
}
