package com.mycompany.controladores;

import com.mycompany.ipersonasexternas.*;
import com.mycompany.vistas.paneles.PersonaExternaPanel;
import com.mycompany.vistas.sistema.*;

public class PersonaExternaControlador {
    private PersonaExternaVista personaExternaVista;
    private PersonaExternaPanel personaExternaPanel;
    private static IPersonasExternas iPersonasExternas; // Instancia compartida

    static {
        // Inicializar la instancia compartida solo una vez
        iPersonasExternas = new PersonasExternas(15);
    }


    public PersonaExternaControlador(PersonaExternaVista personaExternaVista) {
        this.personaExternaVista = personaExternaVista;
        this.personaExternaPanel = new PersonaExternaPanel(this);
    }
    public PersonaExterna[] procesoControladorPersonaExterna() {
        try {
            String nombrePersonaExterna = personaExternaVista.getEntradaNombreJTextField();
            int idPersonaExterna = Integer.parseInt(personaExternaVista.getEntradaIdJTextField());
            String cedulaPersonaExterna = personaExternaVista.getEntradaCedulaJTextField();
            String correoPersonalPersonaExterna = personaExternaVista.getEntradaCorreoPersonalJTextField();
            String descripcionPersonaExterna = personaExternaVista.getEntradaDescripcionJTextField();

            PersonaExterna nuevaPersonaExterna = new PersonaExterna(descripcionPersonaExterna, idPersonaExterna, nombrePersonaExterna, correoPersonalPersonaExterna, cedulaPersonaExterna);
            boolean agregar = iPersonasExternas.agregarPersonaExterna(nuevaPersonaExterna);


            if (agregar) {
                personaExternaVista.mostrarMensajeExito("Persona externa agregada exitosamente.");
                iPersonasExternas.imprimirPersonaExterna();
                return iPersonasExternas.obtenerPersonasExternas();
            } else {
                personaExternaVista.mostrarMensajeError("No se pudo agregar la persona externa.");
            }
        } catch (Exception e) {
            personaExternaVista.mostrarMensajeError("Error en el controlador: " + e.getMessage());
        }
        return null;
        }
    
        public boolean eliminarPersonaExterna(int id) {
            return iPersonasExternas.eliminarPersonaExterna(id);
        }

        public PersonaExterna[] obtenerPersonasExternas() {
            return iPersonasExternas.obtenerPersonasExternas();
        }


}