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
public class CrearDirectorio {
    public static void main(String args[]){
    File f = new File("d:\\Unidad6");
    
    if(f.exists()){
        
        System.out.println(f.getName() + " Ya Existe...");
        
    } else {
        System.out.println("El directorio no existe");
        f.mkdir();
        System.out.println(f.getName() + " Fue Creado...");
    }
  }
}
