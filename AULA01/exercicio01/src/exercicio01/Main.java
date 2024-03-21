package exercicio01;

import classes.ContaCorrente;

/**
 *
 * @author Carolina da Rosa Fagundes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

        conta1.setNumero("123456");
        System.out.println("Numero da conta: " + conta1.getNumero());
        conta1.setSaldo(0);
        conta1.depositar(100.50);
        conta1.sacar(50.00);
        conta1.verSaldo();
        
        System.out.println("----------------------------------------------------");
        conta2.setNumero("56789");
        System.out.println("Numero da conta: " + conta2.getNumero());
        conta2.setSaldo(0);
        conta2.depositar(150.60);
        conta2.sacar(100.60);
        conta2.verSaldo();
        conta2.sacar(100.0);
       
        ContaCorrente conta3 = new ContaCorrente("980", 0, "Luis", "@", "123");
    }
}
