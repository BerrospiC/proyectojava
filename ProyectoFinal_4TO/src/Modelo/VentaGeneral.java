
package Modelo;


public class VentaGeneral {
    private String productoid;
    private double precio;
    private int cantidad;
    private String cliente;

    public VentaGeneral(String productoid, double precio, int cantidad, String cliente) {
        this.productoid = productoid;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cliente = cliente;
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
    public double Total(){
        double total =0;
        total=cantidad*precio;
        return total;
    }
    public double IGV(){
        double igv=0;
        igv=Total()*0.18;
        return igv;
    }
    public double TotalSinIGV(){
        double totalsinigv;
        totalsinigv=Total()-IGV();
        return totalsinigv;
    }
}
