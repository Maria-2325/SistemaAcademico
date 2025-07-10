package com.mycompany.controladores;

import com.mycompany.vistas.sistema.EstudianteVista;
import com.mycompany.iestudiantes.*;

public class EstudianteControlador {
    private static IEstudiantes iEstudiantes; // INSTANCIA COMPARTIDA
    private EstudianteVista estudianteVista;

    static {
        // INICIALIZAR LA INSTANCIA COMPARTIDA SOLO UNA VEZ
        iEstudiantes = new Estudiantes(15);
    }

    public EstudianteControlador(EstudianteVista estudianteVista) {
        this.estudianteVista = estudianteVista;

    }

    public Estudiante[] procesoControladorEstudiante() { // CAMBIAR TIPO DE RETORNO
        try {
            String nombreEstudiante = estudianteVista.getEntradaNombreJTextField();
            int idEstudiante = Integer.parseInt(estudianteVista.getEntradaIdJTextField()); // CORREGIR NOMBRE DE VARIABLE
            String cedulaEstudiante = estudianteVista.getEntradaCedulaJTextField();
            String correoInstitucionalEstudiante = estudianteVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalEstudiante = estudianteVista.getEntradaCorreoPersonalJTextField();
            int codigoEstudiante = Integer.parseInt(estudianteVista.getEntradaCodigoJTextField());

            // CREAR NUEVO ESTUDIANTE CON EL ORDEN CORRECTO DE PARÁMETROS
            Estudiante nuevoEstudiante = new Estudiante(codigoEstudiante, correoInstitucionalEstudiante, idEstudiante, nombreEstudiante, correoPersonalEstudiante, cedulaEstudiante);

            boolean agregar = iEstudiantes.agregarEstudiante(nuevoEstudiante);

            if (agregar) {
                estudianteVista.mostrarMensajeExito("Estudiante agregado exitosamente.");
                iEstudiantes.imprimirEstudiante();
                return iEstudiantes.obtenerEstudiantes(); // RETORNAR ESTUDIANTES ACTUALIZADOS
            } else {
                estudianteVista.mostrarMensajeError("No se pudo agregar el estudiante.");
            }
        } catch (Exception e) {
            estudianteVista.mostrarMensajeError("Error en el controlador del estudiante: " + e.getMessage());
        }
        return null; // RETORNAR NULL EN CASO DE ERROR
    }

    // MÉTODOS AGREGADOS PARA FUNCIONALIDAD COMPLETA
    public boolean eliminarEstudiante(int id) {
        return iEstudiantes.eliminarEstudiante(id);
    }

    public Estudiante[] obtenerEstudiantes() {
        return iEstudiantes.obtenerEstudiantes();
    }

    public Estudiante obtenerEstudiantePorId(int id) {
        return iEstudiantes.buscarEstudiantePorId(id);
    }

    public Estudiante[] buscarEstudiantePorId(int id) {
        // BUSCAR UN ESTUDIANTE ESPECÍFICO Y RETORNARLO EN UN ARRAY
        Estudiante estudiante = iEstudiantes.buscarEstudiantePorId(id);
        if (estudiante != null) {
            return new Estudiante[]{estudiante};
        }
        return new Estudiante[0]; // ARRAY VACÍO SI NO SE ENCUENTRA
    }

    // MÉTODO PARA ACTUALIZAR ESTUDIANTE
    public Estudiante[] procesoActualizarEstudiante(Estudiante estudianteOriginal) {
        try {
            String nombreEstudiante = estudianteVista.getEntradaNombreJTextField();
            int idEstudiante = Integer.parseInt(estudianteVista.getEntradaIdJTextField());
            String cedulaEstudiante = estudianteVista.getEntradaCedulaJTextField();
            String correoInstitucionalEstudiante = estudianteVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalEstudiante = estudianteVista.getEntradaCorreoPersonalJTextField();
            int codigoEstudiante = Integer.parseInt(estudianteVista.getEntradaCodigoJTextField());

            // CREAR ESTUDIANTE ACTUALIZADO
            Estudiante estudianteActualizado = new Estudiante(codigoEstudiante, correoInstitucionalEstudiante, 
                                                            idEstudiante, nombreEstudiante, correoPersonalEstudiante, cedulaEstudiante);

            // BUSCAR EL ÍNDICE DEL ESTUDIANTE ORIGINAL EN EL ARRAY
            boolean actualizado = iEstudiantes.actualizarEstudiante(estudianteOriginal.getId(), estudianteActualizado);

            if (actualizado) {
                estudianteVista.mostrarMensajeExito("Estudiante actualizado exitosamente.");
                iEstudiantes.imprimirEstudiante();
                return iEstudiantes.obtenerEstudiantes();
            } else {
                estudianteVista.mostrarMensajeError("No se pudo actualizar el estudiante.");
            }
        } catch (Exception e) {
            estudianteVista.mostrarMensajeError("Error al actualizar el estudiante: " + e.getMessage());
        }
        return null;
    }
}
