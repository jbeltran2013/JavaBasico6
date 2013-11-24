/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeeyEscribe2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author alumno
 */
public class DeserializarPersona {
    
    public static void Leer(){
    //File archivo = new File("/home/alumno/Persona.ser ");
    File archivo = new File("d:\\Unidad5\\alumno\\Persona1.txt");
    
    try {
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Persona p1 = (Persona)ois.readObject();
        ois.close();
        fis.close();
        System.out.println("Persona recuperada: " + p1.toString());
    } catch (IOException e){
        System.err.println(e.toString());
    } catch (ClassNotFoundException e){
        System.err.println(e.toString());
    }
  }
    
}
