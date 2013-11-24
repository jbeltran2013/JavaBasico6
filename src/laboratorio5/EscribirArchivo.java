/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class EscribirArchivo {
    
    public static void main(String[] args) {
    FileWriter fw = null;
    BufferedWriter bw = null;
    try {
        //fw = new FileWriter("/home/alumno/test");
        fw = new FileWriter("D:\\Unidad5\\alumno\\test.txt");
        bw = new BufferedWriter(fw);
        bw.write("Es una linea de prueba");
        bw.newLine();
        bw.write("Es otra linea...");
        bw.newLine();
        bw.write("Mas lineas...");
        bw.close();
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
}
