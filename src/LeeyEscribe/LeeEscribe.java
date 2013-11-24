/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeeyEscribe;
//import LeeyEscribe.DeserializarPersona;
/**
 *
 * @author alumno
 */
public class LeeEscribe {
    
    static public void main(String [] args){
        DeserializarPersona l = new DeserializarPersona();      
        l.Leer();
        
        SerializarPersona e = new SerializarPersona();
        e.Escribir();
        
    }

    
}
