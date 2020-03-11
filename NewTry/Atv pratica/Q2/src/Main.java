import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Qtd_Pessoas = 1;
        Scanner scanner = new Scanner();
        while(Qtd_Pessoas <= 10){
            Agenda agenda = new Agenda();
            agenda.nome = scanner.next();
            scanner.nextLine();
            agenda.idade = scanner.nextInt();
            scanner.nextLine();
            agenda.altura = scanner.nextFloat();
            agenda.index = Qtd_Pessoas;
            Qtd_Pessoas = Qtd_Pessoas + 1;

        }
    }
}
