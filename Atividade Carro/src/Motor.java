
public class Motor {
    int hodometro;
    public void trocaOleo(int hodometro){
        int troca = hodometro;
        int vezes = 0;
        while(troca > 10000){
            troca = troca - 10000;
            vezes++;
        }
        System.out.println("Faltam "+troca+" Kms para trocar seu oleo!");
        System.out.println("Voce ja trocou o oleo "+vezes+" Vezes!");
    }
}
