//  @author: Licet

package com.mycompany.ipersonasexternas;

public interface IPersonasExternas {

    public boolean agregarPersonaExterna(PersonaExterna personaExterna);
    public boolean actualizarPersonaExterna(int id, PersonaExterna personaExterna);
    public void buscarPersonaExterna(int id);
    public boolean eliminarPersonaExterna(int id);
    public void imprimirPersonaExterna();
    public PersonaExterna[] obtenerPersonasExternas();
    // MÉTODOS AGREGADOS PARA FUNCIONALIDAD DE ACTUALIZACIÓN
    public PersonaExterna obtenerPersonaExternaPorId(int id);
    public boolean actualizarPersonaExternaPorId(int id, PersonaExterna personaActualizada);
    // MÉTODO AGREGADO PARA FUNCIONALIDAD DE BÚSQUEDA
    public PersonaExterna buscarPersonaExternaPorId(int id);
    
}