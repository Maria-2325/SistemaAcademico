package com.mycompany.controladores;

import com.mycompany.vistas.sistema.TrabajadorVista;
import com.mycompany.itrabajador.*;


public class TrabajadorControlador {

    private TrabajadorVista trabajadorVista;
    private ITrabajadores iTrabajadores;

    public TrabajadorControlador(TrabajadorVista trabajadorVista) {
        this.trabajadorVista = trabajadorVista;
        iTrabajadores = new Trabajadores(15);
    }
    public void agregarTrabajador() {
        try {
            String nombreTrabajador = trabajadorVista.getEntradaNombreJTextField();
            int idTrabajador = Integer.parseInt(trabajadorVista.getEntradaIdJTextField());
            String cedulaTrabajador = trabajadorVista.getEntradaCedulaJTextField();
            String correoInstitucionalTrabajador = trabajadorVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalTrabajador = trabajadorVista.getEntradaCorreoPersonalJTextField();
            double sueldoTrabajador = Double.parseDouble(trabajadorVista.getEntradaSueldoJTextField());
            String gremioTrabajador = trabajadorVista.getEntradaGremioJTextField();


            Trabajador nuevoTrabajador = new Trabajador(gremioTrabajador, sueldoTrabajador, correoInstitucionalTrabajador, idTrabajador, nombreTrabajador, correoPersonalTrabajador, cedulaTrabajador);

            boolean agregar = iTrabajadores.agregarTrabajador(nuevoTrabajador);

            if (agregar) {
                trabajadorVista.mostrarMensajeExito("Trabajador agregado exitosamente.");
                iTrabajadores.imprimirTrabajador();
            } else {
                trabajadorVista.mostrarMensajeError("No se pudo agregar el trabajador.");
            }
        } catch (Exception e) {
            trabajadorVista.mostrarMensajeError("Error en el controlador del trabajador: " + e.getMessage());
        }
    }

}
