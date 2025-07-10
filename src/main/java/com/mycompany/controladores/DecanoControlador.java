package com.mycompany.controladores;

import com.mycompany.idecanos.*;
import com.mycompany.vistas.sistema.DecanoVista;

public class DecanoControlador {
    private DecanoVista decanoVista;
    // private
    private IDecanos iDecanos;

    public DecanoControlador(DecanoVista decanoVista) {
        this.decanoVista = decanoVista;
        this.iDecanos = new Decanos(15);
    }

    public void procesoControladorDecano() {
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
            } else {
                decanoVista.mostrarMensajeError("No se pudo agregar el decano.");
            }
        } catch (Exception e) {
            decanoVista.mostrarMensajeError("Error en el controlador del decano: " + e.getMessage());
        }
    }
}
