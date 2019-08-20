/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author estudiante
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Operador instancia1 = new Operador(5,2);
        System.out.println("la respuesta de la suma es:" + instancia1.suma());
        System.out.println("la respuesta de la resta es:" + instancia1.resta());
        System.out.println("la respuesta de la multiplicacion es:" + instancia1.multiplicacion());
        System.out.println("la respuesta de la divicion es;" + instancia1.divicion());
    }
    
}
