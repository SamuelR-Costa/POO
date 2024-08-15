/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.q3;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Pessoa p;
        int contPPL = 1;
                
            do{
             
                p = new Pessoa();
                System.out.println("Informe a altura da pessoa " + contPPL);
                p.altura = read.nextDouble();
                
                System.out.println("Informe o peso dessa pessoa");
                p.peso = read.nextDouble();
                
                System.out.println(p.calcularImc());
                
                 contPPL++;
                
            } while (contPPL <= 3);
    }
    
}
