package composite;

public class Remessa {

    private ItemRemessa conteudo;

    public void setConteudo(ItemRemessa conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        if (this.conteudo == null) {
            throw new NullPointerException("Remessa sem conteudo");
        }

        return this.conteudo.getItem();
    }
}