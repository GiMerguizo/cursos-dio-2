package domain;

public non-sealed class Vendedor extends Empregado{

    private double porcentagemPorVenda;
    private double montante;

    public Vendedor(String nome, String id, String endereco, int idade, double salario, double porcentagemPorVenda,  double montante) {
        super(nome, id, endereco, idade, salario); // o "super" é pra acionar o comportamento da classe pai
        this.porcentagemPorVenda = porcentagemPorVenda;
        this.montante = montante;
    }

    @Override
    public String getId(){
        return "VN" + this.id;
    }

    public Vendedor() {}

    public double getPorcentagemPorVenda() {
        return porcentagemPorVenda;
    }

    public void setPorcentagemPorVenda(double porcentagemPorVenda) {
        this.porcentagemPorVenda = porcentagemPorVenda;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    @Override
    public double getSalarioTotal() {
        return this.salario + (montante * porcentagemPorVenda) / 100;
    }
}
