package com.mycompany.controladores;

import com.mycompany.ipersonasexternas.IPersonasExternas;
import com.mycompany.ipersonasexternas.*;
import com.mycompany.vistas.sistema.*;

public class PersonaExternaControlador {
    private PersonaExternaVista personaExternaVista;
    private IPersonasExternas iPersonasExternas;

    public PersonaExternaControlador(PersonaExternaVista personaExternaVista) {
        this.personaExternaVista = personaExternaVista;
        this.iPersonasExternas = new PersonasExternas(15);
    }
    public void procesoControladorPersonaExterna() {
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
            } else {
                personaExternaVista.mostrarMensajeError("No se pudo agregar la persona externa.");
            }
        } catch (Exception e) {
            personaExternaVista.mostrarMensajeError("Error en el controlador de la persona externa: " + e.getMessage());
        }
    }

}