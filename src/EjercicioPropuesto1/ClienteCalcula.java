/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPropuesto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Gamer
 */
public class ClienteCalcula {
    private String host;
    private int port;
    private float n1;
    private float n2;
    
    
    public ClienteCalcula(String host, int port,float n1,float n2) {
        this.host = host;
        this.port = port;
        this.n1=n1;
        this.n2=n2;
    }
    
    public void doConectar() {
    try {
        Socket cliente = new Socket(host, port);
        // Crear los canales de lectura y escritura
        BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
        PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
        
        ElementosC operac1 = new ElementosC(n1,n2,"+");
        ElementosC operac2 = new ElementosC(n1,n2,"-");
        ElementosC operac3 = new ElementosC(n1,n2,"*");
        ElementosC operac4 = new ElementosC(n1,n2,"/");
        // ArrayList --ingresa la colleccion
        ArrayList<ElementosC> c = new ArrayList<ElementosC>();
        c.add(operac1);
        c.add(operac2);
        c.add(operac3);
        c.add(operac4);
        
        // COMUNICACION 1
        String msg = in.readLine();
        System.out.println(msg);
       
        // COMUNICACION 2
        out.println(c);
        msg = in.readLine();
        System.out.println(msg);
        
        // Cerrar canales
        in.close();
        out.close();
        cliente.close();
    } catch (Exception e) {
        System.out.println("Error Cliente : " + e.getMessage());
    }
  }
}
