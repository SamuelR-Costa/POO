
package lista1.q2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Informe a altura");
        double altura = read.nextDouble();
        
        System.out.println("Informe o peso");
        double peso = read.nextDouble();
        
        Pessoa pessoa;
        pessoa = new Pessoa();
        
        pessoa.peso = peso;
        pessoa.altura = altura;
        
        System.out.println("O IMC da pessoa é: " + pessoa.calcularImc());
    }
}
