/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.q1;

/**
 *
 * @author salfarth
 */
public class Pessoa {
    
    public double peso;
    public double altura;
    
    public double calcularImc() {
    
        return peso/(altura * altura);
        
    }
    
}