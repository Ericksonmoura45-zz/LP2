import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestaContaExcecao {

    Conta conta = null;
    @Before
    public void init(){
        conta = new Conta();
    }

    @Test
    public void sacarValorMaiorQueSaldo() throws ContaExcecao {
        assertFalse(conta.sacar(555555.55));
    }

    @Test
    public void sacarValorMenorQueSaldo() throws ContaExcecao {
        assertTrue(conta.sacar(120));
    }

    @Test
    public void sacarValorIgualASaldo() throws ContaExcecao {
        assertTrue(conta.sacar(conta.getSaldo()));
    }
}