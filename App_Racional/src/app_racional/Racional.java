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
class Racional {
   //atributos
    private int numerador;
    private int denominador;
    
    //construtor
    
    
    //getters e setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador == 0)
            this.denominador = 1;
        else if(denominador < 0 )
            this.denominador = Math.abs(denominador); 
        else
            this.denominador = denominador;
    }
    
    //multiplicação de racionais
    public void multiplicar(Racional r){
        this.numerador=this.numerador*r.getNumerador();
        this.denominador=this.denominador*r.getDenominador();
        
    }
    
    //soma
    public void somar(Racional r){
        this.numerador=this.numerador*r.getDenominador()+this.denominador*r.getNumerador();
        this.denominador=this.denominador*r.getDenominador();
        
        
    }
    
    //divisão
    public void dividir(Racional r){
        int aux = r.getNumerador();
        r.setNumerador(r.getDenominador());
        r.setDenominador(aux);
        multiplicar(r);
                            
    }
    
    //subtracao
    public void subtrair(Racional r){
        r.setNumerador(-r.getNumerador());
        somar(r);
        
    }
    private void simplificar(){
    
    
    }
    
    @Override
    public String toString() {
        if(this.denominador == 1)
            return "" + this.numerador;
        else                
            return this.numerador + "/" + this.denominador;        
    }   
}

    

