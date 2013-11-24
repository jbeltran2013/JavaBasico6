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
public class ListarDirectorio {
    public static void main(String args[]){
        File directorio = new File("D:\\Unidad5\\");
        if ( (directorio.exists()) && (directorio.isDirectory())){
            String[] lista = directorio.list();
            for(int i=0; i<lista.length; i++){
            System.out.println(lista[i]);
        }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
