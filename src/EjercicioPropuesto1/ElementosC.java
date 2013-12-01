/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPropuesto1;

/**
 *
 * @author alumno
 */
public class ElementosC {
     private float n1;
     private float n2;
     private String operador;

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
    
    public ElementosC (float n1, float n2,String operador) {
      this.n1=n1;
      this.n2=n2;
      this.operador=operador;
    }
}
