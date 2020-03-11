import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Qtd_Pessoas = 1;
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        while(Qtd_Pessoas <= 10){
            System.out.println("Digite o nome: ");
            agenda.nome = scanner.next();
            scanner.nextLine();
            System.out.println("Digite a Idade: ");
            agenda.idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a Altura: ");
            agenda.altura = scanner.nextFloat();
            agenda.index = Qtd_Pessoas;
            Qtd_Pessoas = Qtd_Pessoas + 1;
        }
        agenda.imprimeAgenda();
    }
}
