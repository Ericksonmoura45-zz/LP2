public class Conta {

    private double saldo = 1200.50;

    public double getSaldo(){return this.saldo;}

    public boolean sacar(double valor) throws ContaExcecao {
        try {
            if (valor > saldo) {
                throw new ContaExcecao("ContaExcecao",saldo, valor);
            } else {
                saldo -= valor;
                return true;
            }
        }
        catch (ContaExcecao e){
            e.printStackTrace();
            return false;
        }

    }
}
