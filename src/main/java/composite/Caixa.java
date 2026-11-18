package composite;

import java.util.ArrayList;
import java.util.List;

public class Caixa extends ItemRemessa {

    private List<ItemRemessa> itens;

    public Caixa(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemRemessa>();
    }

    public void addItem(ItemRemessa item) {
        this.itens.add(item);
    }

    @Override
    public String getItem() {
        String saida = "Caixa: " + this.getDescricao() + "\n";

        for (ItemRemessa item : itens) {
            saida += item.getItem();
        }

        return saida;
    }
}