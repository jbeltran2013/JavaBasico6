/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class LeerArchivo {
    public static void main(String[] args) {
    FileReader fr = null;
    BufferedReader br = null;
    String sInput = null;
    try {
        //fr = new FileReader("/home/alumno/test");
        fr = new FileReader("D:\\Unidad5\\alumno\\test.txt");
        br = new BufferedReader(fr);
        while ((sInput = br.readLine()) != null) {
            System.out.println(sInput);
        }
        br.close();
        fr.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
