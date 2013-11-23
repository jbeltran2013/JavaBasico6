/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

import java.io.File;

/**
 *
 * @author alumno
 */
public class CompruebaArchivo {
    public static void main(String args[]){
    File f = new File("d:\\unidad5\\temario.txt");
    
    System.out.println("Nombre: " + f.getName());
    System.out.println("Ruta : " + f.getPath());
    System.out.println("Ruta Absoluta: " + f.getAbsolutePath());
    if(f.exists()){
        System.out.println("Archivo sí existe!");
        System.out.println((f.canRead()) ? "Sí se puede leer" : "");
        System.out.println((f.canWrite()) ? "Sí se puede escribir" : "");
        System.out.println("La longitud del archivo es de " + f.length() + " bytes");
    } else {
        System.out.println("El archivo no existe");
    }
  }
}
