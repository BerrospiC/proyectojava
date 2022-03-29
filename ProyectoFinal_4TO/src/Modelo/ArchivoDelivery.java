
package Modelo;

import Modelo.Delivery;
import Modelo.RegistroCliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ArchivoDelivery {
    String ruta="Delivery.txt";
    FileWriter fw;    
    FileReader fr;
    BufferedReader br;
    File f;
    
    public ArrayList<Delivery> array = new ArrayList();
    
    
    public void insertar(Delivery p) throws FileNotFoundException, IOException{
        fw = new FileWriter(ruta,true);
        fw.write(p.getDni()+"-"+p.getProductoid()+"-"+p.getPrecio()+"-"+p.getCantidad()
                +"-"+p.getCliente()+"-"+p.getTelefono()+"-"+p.getProducto()+"-"+p.getDni()+"-"+p.getDireccion()+"\n");
        fw.close();
    }
    
    public void leer()throws FileNotFoundException, IOException{
        array.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String [] vec;
        while(cad!=null){
        vec = cad.split("-");
        array.add(new Delivery(vec[0],vec[1],Double.parseDouble(vec[2]),Integer.parseInt(vec[3]),vec[4],vec[5],vec[6],vec[7]));
        cad=br.readLine();
        }
        fr.close();
    }
     
    
     public void actualizar(ArrayList<Delivery> arrayPer) throws FileNotFoundException, IOException {
        f = new File(ruta);
        fw = new FileWriter(ruta, true);       
        //BORRAR EL ARCHIVO
        fw.close();
        f.delete();
        
        //CREAR UN NUEVO ARCHIVO
        f = new File(ruta);
        if(!f.exists())
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
           fw = new FileWriter(f, true);   
        
        for (Delivery p: arrayPer) { //recorrer todo el arraylist 1 al ultimo          
       fw.write(p.getDni()+"-"+p.getProductoid()+"-"+p.getPrecio()+"-"+p.getCantidad()
                +"-"+p.getCliente()+"-"+p.getTelefono()+"-"+p.getProducto()+"-"+p.getDni()+"-"+p.getDireccion()+"\n");
        }
               
        fw.close();
        
    }
}
