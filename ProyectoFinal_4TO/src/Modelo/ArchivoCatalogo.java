
package Modelo;


import Modelo.Catalogo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ArchivoCatalogo {
    String ruta = "RegistroProducto.txt";
    Catalogo objPr;
    FileReader fr; 
    BufferedReader br;    
    FileWriter fw;       
    File f;

    public ArrayList<Catalogo> listado = new ArrayList();
    
   
    
    public void adicionar(Catalogo e) throws FileNotFoundException, IOException {
     
        fw = new FileWriter(ruta, true);
        String cad = e.getCodigo()+ "-" + e.getDescripcion()+ "-" + e.getPrecio()+ "-" + e.getStock();
        fw.write(cad);
        fw.write(13); 
        fw.close();
    }

    public void leer() throws FileNotFoundException, IOException {
        listado.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String[] vec;
        while (cad != null) {
            vec = cad.split("-");  
            objPr= new Catalogo(vec[0],vec[1],Double.parseDouble(vec[2]),Integer.parseInt(vec[3]));           
            listado.add(objPr);
            cad = br.readLine();
        }
        
        br.close();    
    }

    public void actualizar(ArrayList<Catalogo> array) throws FileNotFoundException, IOException {
        f = new File(ruta);
        fw = new FileWriter(ruta, true);       
        
        fw.close();
        f.delete();
        
       
        f = new File(ruta);
        if(!f.exists())
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        fw = new FileWriter(f, true);   
        

       
        
        for (Catalogo e: array) {
            String cad = e.getCodigo()+ "-" + e.getDescripcion()+ "-" 
                    + e.getPrecio()+ "-" + e.getStock(); 
            fw.write(cad);
            fw.write(13); 
            
            }
            
        fw.close();
       
    }
   
}
