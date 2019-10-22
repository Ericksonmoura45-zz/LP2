package exceptions;

public class Automovel extends Exception {
    private static final int velocidadeMaxima = 120;
    private int velocidadeAtual = 50;


    public void Acelerar(int velocidadeAux) throws Automovel {
        if (velocidadeAtual + velocidadeAux > velocidadeMaxima ){
            //Adicionar Exception: AcimaVelocidadeException
            throw new Automovel();
        }
    }

    @Override
    public String getMessage() {
        return "Excedeu a velocidade máxima!";
    }

}
