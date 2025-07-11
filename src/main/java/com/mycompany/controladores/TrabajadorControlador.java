package com.mycompany.controladores;

import com.mycompany.vistas.sistema.TrabajadorVista;
import com.mycompany.vistas.paneles.TrabajadoresPanel;
import com.mycompany.itrabajador.*;


public class TrabajadorControlador {

    private TrabajadorVista trabajadorVista;
    private TrabajadoresPanel trabajadoresPanel;
    private static ITrabajadores iTrabajadores; // Instancia compartida

    static {
        // Inicializar la instancia compartida solo una vez
        iTrabajadores = new Trabajadores(15);
    }

    public TrabajadorControlador(TrabajadorVista trabajadorVista) {
        this.trabajadorVista = trabajadorVista;
        this.trabajadoresPanel = new TrabajadoresPanel(this);
    }

    public Trabajador[] procesoControladorTrabajador() {
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
                return iTrabajadores.obtenerTrabajadores();
            } else {
                trabajadorVista.mostrarMensajeError("No se pudo agregar el trabajador.");
            }
        } catch (Exception e) {
            trabajadorVista.mostrarMensajeError("Error en el controlador del trabajador: " + e.getMessage());
        }
        return null;
    }

    // MÉTODO PARA PROCESAR LA ACTUALIZACIÓN DE TRABAJADOR
    public Trabajador[] procesoActualizarTrabajador() {
        try {
            String nombreTrabajador = trabajadorVista.getEntradaNombreJTextField();
            int idTrabajador = trabajadorVista.getIdTrabajadorActualizar();
            String cedulaTrabajador = trabajadorVista.getEntradaCedulaJTextField();
            String correoInstitucionalTrabajador = trabajadorVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalTrabajador = trabajadorVista.getEntradaCorreoPersonalJTextField();
            double sueldoTrabajador = Double.parseDouble(trabajadorVista.getEntradaSueldoJTextField());
            String gremioTrabajador = trabajadorVista.getEntradaGremioJTextField();

            Trabajador trabajadorActualizado = new Trabajador(gremioTrabajador, sueldoTrabajador, correoInstitucionalTrabajador, idTrabajador, nombreTrabajador, correoPersonalTrabajador, cedulaTrabajador);
            boolean actualizado = iTrabajadores.actualizarTrabajadorPorId(idTrabajador, trabajadorActualizado);

            if (actualizado) {
                trabajadorVista.mostrarMensajeExito("Trabajador actualizado exitosamente.");
                return iTrabajadores.obtenerTrabajadores();
            } else {
                trabajadorVista.mostrarMensajeError("No se pudo actualizar el trabajador.");
            }
        } catch (Exception e) {
            trabajadorVista.mostrarMensajeError("Error en el controlador: " + e.getMessage());
        }
        return null;
    }

    public boolean eliminarTrabajador(int id) {
        return iTrabajadores.eliminarTrabajador(id);
    }

    public Trabajador[] obtenerTrabajadores() {
        return iTrabajadores.obtenerTrabajadores();
    }

    // MÉTODO PARA OBTENER UN TRABAJADOR POR ID
    public Trabajador obtenerTrabajadorPorId(int id) {
        return iTrabajadores.obtenerTrabajadorPorId(id);
    }

    // MÉTODO PARA BUSCAR TRABAJADOR POR ID (PARA FUNCIONALIDAD DE BÚSQUEDA)
    public Trabajador buscarTrabajadorPorId(int id) {
        return iTrabajadores.buscarTrabajadorPorId(id);
    }
}
