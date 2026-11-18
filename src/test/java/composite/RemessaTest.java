package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class RemessaTest {

    @Test
    void deveRetornarConteudoRemessa() {
        Produto produto1 = new Produto("Notebook", 2.0);
        Produto produto2 = new Produto("Mouse", 0.2);

        Caixa caixaAcessorios = new Caixa("Acessorios");
        caixaAcessorios.addItem(produto2);

        Caixa caixaPrincipal = new Caixa("Pedido Cliente");
        caixaPrincipal.addItem(produto1);
        caixaPrincipal.addItem(caixaAcessorios);

        Remessa remessa = new Remessa();
        remessa.setConteudo(caixaPrincipal);

        assertEquals(
                "Caixa: Pedido Cliente\n" +
                "Produto: Notebook - peso: 2.0 kg\n" +
                "Caixa: Acessorios\n" +
                "Produto: Mouse - peso: 0.2 kg\n",
                remessa.getConteudo()
        );
    }

    @Test
    void deveRetornarExcecaoRemessaSemConteudo() {
        try {
            Remessa remessa = new Remessa();
            remessa.getConteudo();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Remessa sem conteudo", e.getMessage());
        }
    }
}