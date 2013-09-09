/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.wtf.broker.server;

/**
 *
 * @author edwinefl
 */
import javax.jws.WebService;

@WebService(endpointInterface = "main.java.com.wtf.broker.server.ISolicitudCotizacion",serviceName = "ISolicitudCotizacion")
public class SolicitudCotizacionesImpl implements ISolicitudCotizacion {
    
    /**
     *Implementacion registar cotizacion 
     * @return 
     */
    public void registrarSolicitudCotizacion() {
        System.out.println("registrarCotizacion() inicio");
        System.out.println("registrarCotizacion() finish");
    }
 
}
// END SNIPPET: service