
package Modelo;


public class RegistroEmpleo {
    private String codigo; 
    private String nombre,apepaterno,apematerno;
    private int edad ;
    private String sexo;
    private String dni,celular;
    private String email,departamento,distrito,calle;
    private String descanso;
   
    
    public RegistroEmpleo(){
        
    }
    public RegistroEmpleo(Object[]arreglo){
        this.codigo = arreglo[0].toString();
        this.nombre = arreglo[1].toString();
        this.apepaterno = arreglo[2].toString();
        this.apematerno = arreglo[3].toString();
        this.edad = Integer.parseInt(arreglo[4].toString()); 
        this.sexo = arreglo[5].toString();
        this.dni = arreglo[6].toString();
        this.celular = arreglo[7].toString();
        this.email = arreglo[8].toString();
        this.departamento = arreglo[9].toString();
        this.distrito = arreglo[10].toString();
        this.calle = arreglo[11].toString();

   
        
    }
     public Object[] getInfo() {
        Object [] fila ={getCodigo(),getNombre(),getApepaterno(),getApematerno(),getEdad(),getSexo(),getDni(),getCelular(),getEmail(),getDepartamento(),getDistrito(),getCalle()
       };
     
        return fila;
    
        }

     public String cadena(){
        return getCodigo()+"-"+getNombre()+"-"+getApepaterno()+"-"+getApematerno()
                +"-"+getEdad()+"-"+getSexo()+"-"+getDni()+"-"+getCelular()+"-"+getEmail()+"-"+getDepartamento()+"-"+getDistrito()+"-"+getCalle()
                +"\n";
    }
     
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    
}
