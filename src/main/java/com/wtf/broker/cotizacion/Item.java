package main.java.com.wtf.broker.cotizacion;

public class Item {

	//identificador del producto
    private String idItem;
    //decripcion del producto
    private String descripcion;
    //Precio del producto
    private float precio;
       
    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
   
}
