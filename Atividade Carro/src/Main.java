

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Celta";
        carro.marca = "GM";
        carro.velocidade = 20;
        carro.chave = 0;
        carro.combustivel = 10.5;
        carro.marcha = 2;

        carro.liga(carro.chave = 1);
        carro.acelera(carro.velocidade, 20);
        carro.abastecer(carro.combustivel);
        carro.pegaMarcha(carro.marcha);
        carro.freia(carro.velocidade);
        Motor motor = new Motor();
        motor.hodometro = 105000;
        motor.trocaOleo(motor.hodometro);

        Carro carro2 = new Carro();
        carro.modelo = "Onix";
        carro.marca = "GM";
        carro.velocidade = 30;
        carro.chave = 1;
        carro.combustivel = 4;
        carro.marcha = 1;

        carro.liga(carro.chave);
        carro.acelera(carro.velocidade, 20);
        carro.abastecer(carro.combustivel);
        carro.pegaMarcha(carro.marcha);
        Motor motor2 = new Motor();
        motor.hodometro = 96350;
        motor.trocaOleo(motor.hodometro);

        Carro carro3 = new Carro();
        carro.modelo = "TT";
        carro.marca = "Audi";
        carro.velocidade = 100;
        carro.chave = 1;
        carro.combustivel = 14;
        carro.marcha = 5;

        carro.liga(carro.chave);
        carro.acelera(carro.velocidade, 50);
        carro.abastecer(carro.combustivel);
        carro.pegaMarcha(carro.marcha);
        Motor motor3 = new Motor();
        motor.hodometro = 200000;
        motor.trocaOleo(motor.hodometro);


    }
}
