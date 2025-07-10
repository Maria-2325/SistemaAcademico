package com.mycompany.controladores;

import com.mycompany.vistas.sistema.EstudianteVista;
import com.mycompany.iestudiantes.*;

public class EstudiantesControlador {
    private IEstudiantes iEstudiantes;
    private EstudianteVista estudianteVista;

    public EstudiantesControlador(EstudianteVista estudianteVista) {
        this.estudianteVista = estudianteVista;
        this.iEstudiantes = new Estudiantes(15);

    }

    public void procesoControladorEstudiante() {
        try {
            String nombreEstudiante = estudianteVista.getEntradaNombreJTextField();
            int idDecano = Integer.parseInt(estudianteVista.getEntradaIdJTextField());
            String cedulaEstudiante = estudianteVista.getEntradaCedulaJTextField();
            String correoInstitucionalEstudiante = estudianteVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalEstudiante = estudianteVista.getEntradaCorreoPersonalJTextField();
            int  codigoEstudiante = Integer.parseInt(estudianteVista.getEntradaCodigoJTextField());

            Estudiante nuevoEstudiante = new Estudiante(codigoEstudiante, correoInstitucionalEstudiante, idDecano, nombreEstudiante, correoPersonalEstudiante, cedulaEstudiante);

            boolean agregar = iEstudiantes.agregarEstudiante(nuevoEstudiante);

            if (agregar) {
                estudianteVista.mostrarMensajeExito("Estudiante agregado exitosamente.");
                iEstudiantes.imprimirEstudiante();
            } else {
                estudianteVista.mostrarMensajeError("No se pudo agregar el estudiante.");
            }
        } catch (Exception e) {
            estudianteVista.mostrarMensajeError("Error en el controlador del estudiante: " + e.getMessage());
        }
    }
}
