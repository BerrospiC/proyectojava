
package Modelo;


public class Proveedores {
    private String nombres,ruc,razonsocial,direccion,telefono,correoelectronico;
    

public Proveedores(){

}
 public Proveedores(Object [] arreglo) {
     this.nombres = arreglo[0].toString();
     this.ruc = arreglo[1].toString();
     this.razonsocial = arreglo[2].toString();
     this.direccion = arreglo[3].toString();
     this.telefono = arreglo[4].toString();
     this.correoelectronico = arreglo[5].toString();
}
 public Object [] getInformacion(){
        Object[] registro = {getNombres(),getRuc(),getRazonsocial(),getDireccion(),getTelefono(),getCorreoelectronico()
                             };
        return registro;
    }

    
    public Object [] getInfor(){
        Object[] registro = {getNombres(),getRuc(),getRazonsocial(),getDireccion(),getTelefono(),getCorreoelectronico   ()};
        return registro;
    }
    
    public String cadena(){
            return getNombres()+"-"+getRuc()+"-"+getRazonsocial()+"-"+getDireccion()+"-"+getTelefono()+"-"+getCorreoelectronico()+"\n";
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }
 
}