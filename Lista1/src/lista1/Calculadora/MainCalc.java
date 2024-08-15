/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.Calculadora;

/**
 *
 * @author salfarth
 */
public class MainCalc {
    
    public static void main(String[] args) {
        
        calculator calc = new calculator();
        
        calc. setN1(30);
        calc.setN2(5);
        
        System.out.println("O primeiro numero da calculadora É: " + calc.getN1());
        System.out.println("O segundo numero da calculadora É: " + calc.getN2());
        System.out.println("O valor da soma É: " + calc.somar());
        System.out.println("O valor da subtração É: " + calc.subtrair());
        System.out.println("O valor da multipliação É: " + calc.multiplicar());
        System.out.println("O valor da diisão É: " + calc.dividir());
        
    

   
        System.out.println("O valor da soma É: ");
        
    }
    
}
