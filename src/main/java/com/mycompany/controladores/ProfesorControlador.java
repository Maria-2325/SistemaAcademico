package com.mycompany.controladores;

import com.mycompany.vistas.sistema.ProfesorVista;
import com.mycompany.iprofesores.*;
public class ProfesorControlador {

    private ProfesorVista profesorVista;
    private IProfesores iProfesores;

    public ProfesorControlador(ProfesorVista profesorVista) {
        this.profesorVista = profesorVista;
        this.iProfesores = new Profesores(15);
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

    public void procesoControladorProfesor() {
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
            } else {
                profesorVista.mostrarMensajeError("No se pudo agregar el profesor.");
            }
        } catch (Exception e) {
            profesorVista.mostrarMensajeError("Error en el controlador del profesor: " + e.getMessage());
        }
    }

}