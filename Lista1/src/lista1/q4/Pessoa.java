
package lista1.q4;

public class Pessoa {
    
    public double peso;
    public double altura;
    public String nome;
    public double calcularImc() {
    
        return peso /(altura * altura);
        
    }
    
}