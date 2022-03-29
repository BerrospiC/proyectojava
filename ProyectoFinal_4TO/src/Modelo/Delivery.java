
package Modelo;


public class Delivery {
    
    private String dni;
    private String productoid;
    private double precio;
    private int cantidad;
    private String cliente;
    private String telefono;
    private String producto;
    private String direccion;
    
    public Delivery(){
        
    }

    public Delivery(String dni, String productoid, double precio, int cantidad, String cliente, String telefono, String producto, String direccion) {
        this.dni = dni;
        this.productoid = productoid;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.telefono = telefono;
        this.producto = producto;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProductoid() {
        return productoid;
    }

    public void setProductoid(String productoid) {
        this.productoid = productoid;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double Total(){
        return getCantidad()*getPrecio();
    }

  
}
