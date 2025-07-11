package com.mycompany.controladores;

import com.mycompany.vistas.sistema.ProfesorVista;
import com.mycompany.vistas.paneles.ProfesoresPanel;
import com.mycompany.iprofesores.*;

public class ProfesorControlador {

    private ProfesorVista profesorVista;
    private ProfesoresPanel profesoresPanel;
    private static IProfesores iProfesores; // INSTANCIA COMPARTIDA

    static {
        // INICIALIZAR LA INSTANCIA COMPARTIDA SOLO UNA VEZ
        iProfesores = new Profesores(15);
    }

    public ProfesorControlador(ProfesorVista profesorVista) {
        this.profesorVista = profesorVista;
        this.profesoresPanel = new ProfesoresPanel(this);
    }

    private Escalafon identificarEscalafon(String itemEscalafon){
        Escalafon tipoEscalafon = Escalafon.valueOf(itemEscalafon.toUpperCase());

        if (tipoEscalafon == Escalafon.PRINCIPAL) {
            return Escalafon.PRINCIPAL;
        } else if (tipoEscalafon == Escalafon.AGREGADO) {
            return Escalafon.AGREGADO;
        } else {
            return Escalafon.AUXILIAR;
        }
    }

    public Profesor[] procesoControladorProfesor() {
        try {
            String nombreProfesor = profesorVista.getEntradaNombreJTextField();
            int idProfesor = Integer.parseInt(profesorVista.getEntradaIdJTextField());
            String cedulaProfesor = profesorVista.getEntradaCedulaJTextField();
            String correoInstitucionalProfesor = profesorVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalProfesor = profesorVista.getEntradaCorreoPersonalJTextField();
            double sueldoProfesor = Double.parseDouble(profesorVista.getEntradaSueldoJTextField());
            String dedicacionProfesor = profesorVista.getEntradaDedicacionJTextField();
            String itemEscalafon = profesorVista.getEntradaEscalafonJComboBox();
            Escalafon itemEscalafonSeleccionado = identificarEscalafon(itemEscalafon);
            
            Profesor nuevoProfesor = new Profesor(dedicacionProfesor, sueldoProfesor, correoInstitucionalProfesor, idProfesor, nombreProfesor, correoPersonalProfesor, cedulaProfesor, itemEscalafonSeleccionado);

            boolean agregar = iProfesores.agregarProfesor(nuevoProfesor);

            if (agregar) {
                profesorVista.mostrarMensajeExito("Profesor agregado exitosamente.");
                iProfesores.imprimirProfesor();
                return iProfesores.obtenerProfesores();
            } else {
                profesorVista.mostrarMensajeError("No se pudo agregar el profesor.");
            }
        } catch (Exception e) {
            profesorVista.mostrarMensajeError("Error en el controlador del profesor: " + e.getMessage());
        }
        return null;
    }

    // MÉTODO PARA PROCESAR LA ACTUALIZACIÓN DE PROFESOR
    public Profesor[] procesoActualizarProfesor() {
        try {
            String nombreProfesor = profesorVista.getEntradaNombreJTextField();
            int idProfesor = profesorVista.getIdProfesorActualizar();
            String cedulaProfesor = profesorVista.getEntradaCedulaJTextField();
            String correoInstitucionalProfesor = profesorVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalProfesor = profesorVista.getEntradaCorreoPersonalJTextField();
            double sueldoProfesor = Double.parseDouble(profesorVista.getEntradaSueldoJTextField());
            String dedicacionProfesor = profesorVista.getEntradaDedicacionJTextField();
            String itemEscalafon = profesorVista.getEntradaEscalafonJComboBox();
            Escalafon itemEscalafonSeleccionado = identificarEscalafon(itemEscalafon);

            Profesor profesorActualizado = new Profesor(dedicacionProfesor, sueldoProfesor, correoInstitucionalProfesor, idProfesor, nombreProfesor, correoPersonalProfesor, cedulaProfesor, itemEscalafonSeleccionado);
            boolean actualizado = iProfesores.actualizarProfesorPorId(idProfesor, profesorActualizado);

            if (actualizado) {
                profesorVista.mostrarMensajeExito("Profesor actualizado exitosamente.");
                return iProfesores.obtenerProfesores();
            } else {
                profesorVista.mostrarMensajeError("No se pudo actualizar el profesor.");
            }
        } catch (Exception e) {
            profesorVista.mostrarMensajeError("Error en el controlador: " + e.getMessage());
        }
        return null;
    }

    public boolean eliminarProfesor(int id) {
        return iProfesores.eliminarProfesor(id);
    }

    public Profesor[] obtenerProfesores() {
        return iProfesores.obtenerProfesores();
    }

    // MÉTODO PARA OBTENER UN PROFESOR POR ID
    public Profesor obtenerProfesorPorId(int id) {
        return iProfesores.obtenerProfesorPorId(id);
    }

    // MÉTODO PARA BUSCAR PROFESOR POR ID (PARA FUNCIONALIDAD DE BÚSQUEDA)
    public Profesor buscarProfesorPorId(int id) {
        return iProfesores.buscarProfesorPorId(id);
    }
}