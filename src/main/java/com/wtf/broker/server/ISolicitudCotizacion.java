package main.java.com.wtf.broker.server;
/**
*
* @author edwinefl
*/

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@WebService
public interface ISolicitudCotizacion {
	
	    void registrarSolicitudCotizacion();
}
