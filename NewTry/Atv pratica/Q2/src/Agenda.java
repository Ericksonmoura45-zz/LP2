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
        do {
            System.out.println("Nome: " + nome + "\n");
            System.out.println("Idade: " + idade + "\n");
            System.out.println("Altura: " + altura + "\n");
            System.out.println("Posição: " + index + "\n" + "\n");
            index = index + 1;
        } while(index <= 10);

    }
    void imprimePessoa(int index){
// Não deu tempo :'(
    }
}
