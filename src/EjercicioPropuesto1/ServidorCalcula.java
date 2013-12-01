/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPropuesto1;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Gamer
 */
public class ServidorCalcula {
    private int port;
   
    
    public ServidorCalcula(int port) {
        this.port = port;
        
    }
    
    public void ejecutar() {
    try {
        // Creamos un servidor de Socket
        ServerSocket server = new ServerSocket(port);
        System.out.println("Servidor iniciado...");
        
        while(true){
            System.out.println("Esperando ...");
            Socket cliente = server.accept();
            ServidorCalculaHilo ts = new ServidorCalculaHilo(cliente);
            ts.start();
        }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        e.printStackTrace();
        }
    }
}
