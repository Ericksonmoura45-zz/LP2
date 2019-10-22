package exceptions;

public class Pista extends Exception{

    public void iniciar() throws Pista{
        try {
            Automovel automovel = new Automovel();
            automovel.Acelerar(80);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Pista();
        }
    }

    @Override
    public String getMessage() {
        return "Pneu Furou";
    }
}
