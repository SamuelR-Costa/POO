/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.Calculadora;

/**
 *
 * @author salfarth
 */
public class calculator {
    
    private double N1;
    private double N2;
    
    public double getN1() {
        return this.N1;
    }
    
   
    public void setN1(double N1) {
         this.N1 = N1;
    }
    
     public double getN2() {
       return this.N2;   
    }
    
    public void setN2(double N2) {
        this.N2 = N2;    
    }
   
    public double somar(){    
        return N1 + N2;    
    }
    
    public double subtrair () {    
        return N1 - N2;    
    }
    
    public double multiplicar () {           
        return N1 * N2;        
    }
     
    public double dividir () {    
        return N1 / N2;        
    }   
    
}  
   
        