public class Conta {

    int numConta;
    String NomeCliente;
    double Saldo;

    public void Saque (double quantidade){
        this.Saldo -= quantidade;
    }
    boolean Saca (double quantidade){
        if(this.Saldo < quantidade){
            return false;
        } else {
            this.Saldo -= quantidade;
            return true;

        }
    }
    public void Deposita (double quantidade){
        this.Saldo += quantidade;

    }
    public  void ImpTitular (int conta){
        if(conta == this.numConta){
            System.out.println(this.NomeCliente);
        }
    }
    public double transferir (int conta, double valor){
        if(conta == this.numConta){
            return this.Saldo += valor;
        } else
        return valor;
    }

}
