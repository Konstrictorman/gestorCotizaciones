package main.java.com.wtf.broker.server;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwinefl
 */
import javax.xml.ws.Endpoint;

public class Server {

    protected Server() throws Exception {
        // START SNIPPET: publish
        System.out.println("Starting Server");
        SolicitudCotizacionesImpl implementor = new SolicitudCotizacionesImpl();
        String address = "http://localhost:8080/solicitudCotizacion?wsdl";
        Endpoint.publish(address, implementor);
        // END SNIPPET: publish
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
