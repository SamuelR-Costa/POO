
package lista1.q2;

public class Pessoa {
    
    public double peso;
    public double altura;
    
    public double calcularImc() {
    
        return peso/(altura * altura);
        
    }
    
}