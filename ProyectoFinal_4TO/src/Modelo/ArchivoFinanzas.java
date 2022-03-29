
package Modelo;

import Modelo.Finanzas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ArchivoFinanzas {
    String ruta = "finanzasdeldueño.txt";
    Finanzas objAsun;
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;

    public ArrayList<Finanzas> listado = new ArrayList();

    public void adicionar(Finanzas f) throws FileNotFoundException, IOException {
        //f = new File(ruta);
        fw = new FileWriter(ruta, true);
        String cad = f.getAsunto() + "-" + f.getMonto() + "-" + f.getFecha();
        fw.write(cad);
        fw.write(13); //hace un salto de linea
        fw.close();
    }

    public void leer() throws FileNotFoundException, IOException {
        listado.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String[] vec;
        while (cad != null) {
            vec = cad.split("-");  //separar la cadena en un vector
            objAsun = new Finanzas(vec[0], Double.parseDouble(vec[1]), vec[2]);
            listado.add(objAsun);
            cad = br.readLine();
        }

        br.close();
    }

    public void actualizar(ArrayList<Finanzas> array) throws FileNotFoundException, IOException {
        f = new File(ruta);
        fw = new FileWriter(ruta, true);
        //BORRAR EL ARCHIVO
        fw.close();
        f.delete();

        //CREAR UN NUEVO ARCHIVO
        f = new File(ruta);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        fw = new FileWriter(f, true);

        for (Finanzas f : array) {
            String cad = f.getAsunto() + "-" + f.getMonto() + "-"
                    + f.getFecha();
            fw.write(cad);
            fw.write(13); //hace un salto de linea

        }

        fw.close();

    }
}
