package composite;

public class Produto extends ItemRemessa {

    private double peso;

    public Produto(String descricao, double peso) {
        super(descricao);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String getItem() {
        return "Produto: " + this.getDescricao() +
                " - peso: " + this.peso + " kg\n";
    }
}