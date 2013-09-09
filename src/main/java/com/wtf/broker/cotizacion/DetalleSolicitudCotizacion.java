package main.java.com.wtf.broker.cotizacion;

public class DetalleSolicitudCotizacion {
	
	String idDetalleSolicitudCotizacion;
	Item item;
	int cantidad;
	
	public String getIdDetalleSolicitudCotizacion() {
		return idDetalleSolicitudCotizacion;
	}
	
	public void setIdDetalleSolicitudCotizacion(String idDetalleSolicitudCotizacion) {
		this.idDetalleSolicitudCotizacion = idDetalleSolicitudCotizacion;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
