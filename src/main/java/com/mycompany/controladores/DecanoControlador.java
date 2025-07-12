package com.mycompany.controladores;

import com.mycompany.idecanos.*;
import com.mycompany.vistas.sistema.DecanoVista;

public class DecanoControlador {
    private DecanoVista decanoVista;
    private static IDecanos iDecanos; // Instancia compartida

    static {
        // Inicializar la instancia compartida solo una vez
        iDecanos = new Decanos(15);
    }

    public DecanoControlador(DecanoVista decanoVista) {
        this.decanoVista = decanoVista;
    }

    // Constructor sin vista para el panel
    public DecanoControlador() {
        this.decanoVista = null;
    }

    public Decano[] procesoControladorDecano() {
        try {
            String nombreDecano = decanoVista.getEntradaNombreJTextField();
            int idDecano = Integer.parseInt(decanoVista.getEntradaIdJTextField());
            String cedulaDecano = decanoVista.getEntradaCedulaJTextField();
            String correoInstitucionalDecano = decanoVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalDecano = decanoVista.getEntradaCorreoPersonalJTextField();
            double sueldoDecano = Double.parseDouble(decanoVista.getEntradaSueldoJTextField());
            String dedicacionDecano = decanoVista.getEntradaDedicacionJTextField();
            String nivelDecano = decanoVista.getEntradaNivelJTextField();

            Decano nuevoDecano = new Decano(dedicacionDecano, sueldoDecano, correoInstitucionalDecano, idDecano, nombreDecano, correoPersonalDecano, cedulaDecano, nivelDecano);

            boolean agregar = iDecanos.agregarDecano(nuevoDecano);

            if (agregar) {
                decanoVista.mostrarMensajeExito("Decano agregado exitosamente.");
                iDecanos.imprimirDecano();
                return iDecanos.obtenerDecanos();
            } else {
                decanoVista.mostrarMensajeError("No se pudo agregar el decano.");
            }
        } catch (Exception e) {
            decanoVista.mostrarMensajeError("Error en el controlador del decano: " + e.getMessage());
        }
        return null;
    }

    // MÉTODO PARA PROCESAR LA ACTUALIZACIÓN DE DECANO
    public Decano[] procesoActualizarDecano() {
        try {
            String nombreDecano = decanoVista.getEntradaNombreJTextField();
            int idDecano = decanoVista.getIdDecanoActualizar();
            String cedulaDecano = decanoVista.getEntradaCedulaJTextField();
            String correoInstitucionalDecano = decanoVista.getEntradaCorreoInstitucionalJTextField();
            String correoPersonalDecano = decanoVista.getEntradaCorreoPersonalJTextField();
            double sueldoDecano = Double.parseDouble(decanoVista.getEntradaSueldoJTextField());
            String dedicacionDecano = decanoVista.getEntradaDedicacionJTextField();
            String nivelDecano = decanoVista.getEntradaNivelJTextField();

            Decano decanoActualizado = new Decano(dedicacionDecano, sueldoDecano, correoInstitucionalDecano, idDecano, nombreDecano, correoPersonalDecano, cedulaDecano, nivelDecano);
            boolean actualizado = iDecanos.actualizarDecanoPorId(idDecano, decanoActualizado);

            if (actualizado) {
                decanoVista.mostrarMensajeExito("Decano actualizado exitosamente.");
                return iDecanos.obtenerDecanos();
            } else {
                decanoVista.mostrarMensajeError("No se pudo actualizar el decano.");
            }
        } catch (Exception e) {
            decanoVista.mostrarMensajeError("Error en el controlador: " + e.getMessage());
        }
        return null;
    }

    public boolean eliminarDecano(int id) {
        return iDecanos.eliminarDecano(id);
    }

    public Decano[] obtenerDecanos() {
        return iDecanos.obtenerDecanos();
    }

    // MÉTODO PARA OBTENER UN DECANO POR ID
    public Decano obtenerDecanoPorId(int id) {
        return iDecanos.obtenerDecanoPorId(id);
    }

    // MÉTODO PARA BUSCAR DECANO POR ID (PARA FUNCIONALIDAD DE BÚSQUEDA)
    public Decano buscarDecanoPorId(int id) {
        return iDecanos.buscarDecanoPorId(id);
    }

    // Método buscarDecano para el panel
    public Decano buscarDecano(int id) {
        return iDecanos.obtenerDecanoPorId(id);
    }

    // MÉTODO PARA BUSCAR DECANOS POR NOMBRE
    public Decano[] buscarDecanosPorNombre(String nombre) {
        return iDecanos.buscarDecanosPorNombre(nombre);
    }
}
