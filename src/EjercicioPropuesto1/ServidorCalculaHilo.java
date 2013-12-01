/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPropuesto1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Gamer
 */
public class ServidorCalculaHilo extends Thread {
    private Socket cliente;
   
    public ServidorCalculaHilo(Socket cliente) {
        this.cliente = cliente;       
    }
    
    public void run() {
        try {
        // Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
            cliente.getInputStream()));
            // COMUNICACION 1
            out.println("SERVIDOR: Calculadora Cientifica--> ");
            // COMUNICACION 2
            String c1 = in.readLine();
            
 //           System.out.println("Linea: "+c1);
//            out.println("SERVIDOR:"+c1);
        //   List<String> c = Arrays.asList(c1); 
        //    Set<Elementos> mySet = new HashSet<Elementos>(Arrays.asList(c1)); 
            //ArrayList<Elementos> c = new ArrayList<Elementos>(c1);
            //ArrayList<Elementos> c = (Elementos)c1;
            Elementos c2 = new Elementos(c1);
            //ArrayList<Elementos> lista = new ArrayList<Elementos>();     
            //List<Elementos> list = new ArrayList<Elementos>(c2);
            
      /*      for (Elementos e : c2) {
               e.toString();
            }
       */
            //System.out.println(resp2);
            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null)
                    cliente.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
