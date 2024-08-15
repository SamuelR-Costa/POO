/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.q4;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
 Scanner read = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa [3];
        Pessoa p;
        
        int contPPL = 1;
                
            do{
             
                p = new Pessoa();
                System.out.println("Informe a altura da pessoa " + contPPL);
                p.altura = read.nextDouble();
                
                System.out.println("Informe o peso dessa pessoa");
                p.peso = read.nextDouble();
                
                System.out.println("Informe o nome dessa pessoa");
                p.nome = read.next();
                
                System.out.println(p.calcularImc());
                pessoas[contPPL - 1] = p;
                 contPPL++;
                
            } while (contPPL <= 3);
            
            for (int i = 2; i >=0; i--){
            
                p = pessoas[i];
                System.out.println("O nome da pessoa " + (i + 1) + " é : " + (p.nome));
                System.out.println("O altura da pessoa " + (i + 1) + " é : " + (p.altura));
                System.out.println("O peso da pessoa " + (i + 1) + " é : " + (p.peso));
                System.out.println("O IMC da pessoa " + (i + 1) + " é : " + (p.calcularImc()));
            }
    }
    
}