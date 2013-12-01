/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPropuesto1;

import Sockets.Hilo.Servidor2;

/**
 *
 * @author Gamer
 */
public class ServidorCalculaInicia {
   
    public static void main(String[] args) {
    //Servidor s = new Servidor(2365);
    ServidorCalcula s = new ServidorCalcula(2365);    
    s.ejecutar();
    
    }
}
