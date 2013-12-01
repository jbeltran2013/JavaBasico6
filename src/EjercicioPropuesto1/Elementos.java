/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioPropuesto1 ;

import java.io.Serializable;

/**
 *
 * @author Gamer
 */
public class Elementos {
    private float n1;
    private float n2;
    private String operador;

    Elementos(String c1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    public Elementos (float n1, float n2, String operador) {
      this.n1=n1;
      this.n2=n2;
      this.operador=operador;
    }
    
    public String toString(){
        float res=0;
        String TipoOpera="";
        if (operador.equals("+")) {
            res=n1+n2;      
            TipoOpera="Suma: ";
        }
        if (operador.equals("-")) {
            res=n1-n2;      
            TipoOpera="Resta: ";
        }
        if (operador.equals("*")) {
            res=n1*n2;      
            TipoOpera="Producto: ";
        }
        if (operador.equals("/")) {
            try {
                 res=n1/n2;      
                 TipoOpera="División: ";
            } catch (Exception e) {
                return "división entre cero";
            }    
        }
     
        return  TipoOpera + res;
    }
}
