/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeeyEscribe;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author alumno
 */
public class SerializarPersona {
        
    public void Escribir(){
    FileOutputStream archivo = null;
    ObjectOutputStream salida = null;
    Persona p1 = new Persona("Jose", 29);
    
    try {
        //archivo = new FileOutputStream("/home/alumno/Persona.ser");
        archivo = new FileOutputStream("d:\\Unidad5\\alumno\\Persona.txt");
        
        salida = new ObjectOutputStream(archivo);
        salida.writeObject(p1);
        salida.flush();
    } catch (IOException e){
        System.out.println("Imposible crear el archivo o escribir en él");
    } finally {
    try {
        salida.close();
    } catch (IOException e){
        System.out.println("No pudo cerrarse el canal");
    }
    }
  }
    
}
