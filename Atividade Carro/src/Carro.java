
public class Carro {
    String modelo;
    String marca;
    int chave;
    int velocidade;
    double combustivel;
    int marcha;

    public void liga (int aux) {
        if (aux >= 1) {
            System.out.println("Carro Ligado!");
        } else {
            System.out.println("Carro Desligado!");
        }
    }
    public int acelera (int velocidadeAtual, int aceleracao){
        return velocidadeAtual+aceleracao;
    }
    public void freia (int velocidadeAtual){
        velocidadeAtual = 0;
        System.out.println("Carro Parado!");
    }
    public int pegaMarcha (int atual){
        return atual+1;
    }
    public void abastecer(double combustivel){
        if (combustivel <= 4.5){
            System.out.println("Carro na reserva, vamos abastecer!");
        }
        if(combustivel == 0){
            System.out.println("Carro sem gasolina!");

        }

    }

}
