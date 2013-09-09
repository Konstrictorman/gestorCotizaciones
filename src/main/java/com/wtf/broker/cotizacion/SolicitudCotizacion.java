package main.java.com.wtf.broker.cotizacion;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



/**
*
* @author edwinefl
*/

public class SolicitudCotizacion {

	String idSolicitudCotizacion;
	Date fechaSolicitudCotizacion;
	DetalleSolicitudCotizacion detalle;
	
	public String getIdSolicitudCotizacion() {
		return idSolicitudCotizacion;
	}
	public void setIdSolicitudCotizacion(String idSolicitudCotizacion) {
		this.idSolicitudCotizacion = idSolicitudCotizacion;
	}
	public Date getFechaSolicitudCotizacion() {
		return fechaSolicitudCotizacion;
	}
	public void setFechaSolicitudCotizacion(Date fechaSolicitudCotizacion) {
		this.fechaSolicitudCotizacion = fechaSolicitudCotizacion;
	}
	public DetalleSolicitudCotizacion getDetalle() {
		return detalle;
	}
	public void setDetalle(DetalleSolicitudCotizacion detalle) {
		this.detalle = detalle;
	}

	
}
