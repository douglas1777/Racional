/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_racional;

/**
 *
 * @author lab211
 */
public class App_Racional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Racional r = new Racional();
        Racional r1 = new Racional();
        r.setNumerador(-5);
        r.setDenominador(2);
        r1.setNumerador(4);
        r1.setDenominador(3);
        r.multiplicar(r1);
        System.out.println(r.toString());
        
        r.setNumerador(2);
        r.setDenominador(3);
        r1.setNumerador(4);
        r1.setDenominador(5);
        r.somar(r1);
        System.out.println(r.toString());
        
       r.setNumerador(9);
        r.setDenominador(2);
        r1.setNumerador(7);
        r1.setDenominador(3);
        r.dividir(r1);
        System.out.println(r.toString());
        
        
        r.setNumerador(3);
        r.setDenominador(8);
        r1.setNumerador(5);
        r1.setDenominador(12);
        r.subtrair(r1);
        System.out.println(r.toString());
        
     
        
        
        
    }
    
}
