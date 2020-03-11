public class Agenda {

    String nome;
    int idade;
    float altura;
    int index;

    void armazenaPessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    void removePessoa(String nome){
        this.nome = "";
        this.idade = 0;
        this.altura = 0;
    }
    void buscaPessoa(String nome){
        if(nome.equals(this.nome)){
            System.out.println("Pessoa "+this.nome+" encontrada!");
        }
    }
    void imprimeAgenda(){

    }
    void imprimePessoa(int index){

    }
}
