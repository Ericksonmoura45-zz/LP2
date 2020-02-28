
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.numConta = 978558;
        conta.NomeCliente = "Dennis";
        conta.Saldo = 30000.976;

        System.out.println(conta.NomeCliente+" "+conta.numConta+" "+conta.Saldo);
    }
}
