
package Modelo;


public class RegistroProducto {
    private String Codigo;
    private String Descripcion;
    private double precio;
    private int Stock;
    
    public RegistroProducto(){
     
    }

    public RegistroProducto(String Codigo, String Descripcion, double precio, int Stock) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.Stock = Stock;
    }

    


    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
}
