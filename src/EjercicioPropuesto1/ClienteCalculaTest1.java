/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPropuesto1;

//import Sockets.Hilo.Cliente;

/**
 *
 * @author Gamer
 */
public class ClienteCalculaTest1 {
    public static void main(String[] args) {
       ClienteCalcula c = new ClienteCalcula("localhost", 2365,21,34);
       c.doConectar();
    }  
}
