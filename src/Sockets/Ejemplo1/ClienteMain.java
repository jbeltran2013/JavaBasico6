/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets.Ejemplo1;

/**
 *
 * @author alumno
 */
public class ClienteMain {
    
    public static void main(String[] args) {
       Cliente c = new Cliente("localhost", 2365);
       c.doConectar();
    }
    
}
