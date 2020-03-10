import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String data1;
        String textos;
        boolean avante;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a data: ");
        data1 = ler.next();
        ler.nextLine();
        System.out.println("Digite sua anotação: \n");
        textos = ler.nextLine();

        Agenda agenda = new Agenda();
        agenda.setData(data1);
        agenda.setAnotacao(textos);
        agenda.ScratchPrint();

    }
}
