public class Pessoa {

    private String nome;
    private int dataNascimento; //Somente Ano
    private float altura;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int Calc_Idade(int data){
        return 2020-data;

    }
    public void VerificaIdade(int dataNascimento){
        if(dataNascimento < 0){
            System.out.println("Data Inválida!");
        }
    }
    int idade = Calc_Idade(dataNascimento);

    public void ImprimePessoa (){
        VerificaIdade(this.idade);
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+Calc_Idade(this.idade));
        System.out.println("Altura: "+getAltura()+" cm");
    }



}
