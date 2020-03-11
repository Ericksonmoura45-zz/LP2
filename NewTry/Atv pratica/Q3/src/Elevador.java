public class Elevador {

    int totalAndares;
    int AndarAtual;
    float Cap_Elevador = 10;
    int QtdPessoas;


    public int getAndarAtual() {
        return AndarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        AndarAtual = andarAtual;
    }

    public float getCap_Elevador() {
        return Cap_Elevador;
    }

    public void setCap_Elevador(float cap_Elevador) {
        Cap_Elevador = cap_Elevador;
    }

    public int getQtdPessoas() {
        return QtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        QtdPessoas = qtdPessoas;
    }
    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
    public void Inicializa(float cap_Elevador, int AndarAtual){
        setAndarAtual(0);
        setCap_Elevador(10);
        setTotalAndares(15);
    }
    public void Entra(){

    }
    public void Sai(){

    }
    public void Sobe(){
        setAndarAtual(+1);
    }
    public void Desce(){
        setAndarAtual(-1);
    }



}
