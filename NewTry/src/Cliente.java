public class Cliente {

    String nome;
    int cpf;
    int numConta;
    int ID;

    public Cliente(){
        this.ID = ID;
    }
    public  void ImpTitular (int conta){
        if(conta == this.numConta)
            System.out.println(this.nome);

    }
}
