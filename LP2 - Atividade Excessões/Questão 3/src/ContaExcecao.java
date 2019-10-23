public class ContaExcecao extends Exception {

    private String msg;
    private double saldo;
    private double valor;


    public ContaExcecao(String msg,double saldo, double valor){
        super(msg);
        this.saldo = saldo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getMessage()+"\nO valor "+valor+" é maior que "+saldo;
    }


}
