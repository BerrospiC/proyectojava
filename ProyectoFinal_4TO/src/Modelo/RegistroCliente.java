
package Modelo;


public class RegistroCliente {
    private String Codigo;
    private String Nombres;
    private String Apellidos;
    private String EstadoCivil;
    private String Sexo;
    private String Ruc;
    private String Celular;
    private String Dni;
    private String Edad;

   

    public RegistroCliente(String Codigo, String Nombres, String Apellidos, String EstadoCivil, String Sexo, String Ruc, String Celular,String Dni, String Edad) {
        this.Codigo = Codigo;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.EstadoCivil = EstadoCivil;
        this.Sexo = Sexo;
        this.Ruc = Ruc;
        this.Celular = Celular;
        this.Dni = Dni;
        this.Edad = Edad;
    }
    
    public RegistroCliente(){
        
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
     public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }
    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
}
