public class Conta {
    public static int contas = 0;
    double Saldo;

    public Conta() {
        Cliente cliente = new Cliente();
        cliente.cpf = 1234568987;
        cliente.nome = "Arnold";
        cliente.numConta = 126548;
        cliente.ID = 19;
        contas = contas + 1;
    }


    public void Saque(double quantidade) {
        this.Saldo -= quantidade;
    }

    boolean Saca(double quantidade) {
        if (this.Saldo < quantidade) {
            return false;
        } else {
            this.Saldo -= quantidade;
            return true;

        }
    }

    public void Deposita(double quantidade) {
        this.Saldo += quantidade;

    }
}
/*
    public double transferir (int conta, double valor){
        if(conta == ??????){
            return this.Saldo += valor;
        } else
        return valor;
    }

}
*/
