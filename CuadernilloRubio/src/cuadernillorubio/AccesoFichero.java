/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadernillorubio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mañanas
 */
public class AccesoFichero {
    private static String archivo="C:\\Jessica\\cuadernillo_Rubio.csv";
    private static String separador=",";

    public static void grabarPuntuacion(Puntuacion puntos) {
        
        try{
            FileWriter fw=new FileWriter(archivo, true);
            String texto=puntos.getNombre()+separador+puntos.getAciertos()+separador+puntos.getTotales();
            fw.write(texto);
            fw.write("\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static ArrayList<Puntuacion> obtenerPuntuaciones() {
     ArrayList<Puntuacion> lista=new ArrayList();
        try {
            FileReader lector=new FileReader(archivo);
            //Para leer lineas enteras:
            BufferedReader br=new BufferedReader(lector);
            String linea=br.readLine();
            while(linea!=null){
                String [] campos=linea.split(separador);
                String nombre=campos[0];
                String aciertos=campos[1];
                String totales=campos[2];
                Puntuacion p=new Puntuacion(nombre,Integer.parseInt(aciertos),Integer.parseInt(totales));
                lista.add(p);
                linea=br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    

    
      
    

  
        
    
}
