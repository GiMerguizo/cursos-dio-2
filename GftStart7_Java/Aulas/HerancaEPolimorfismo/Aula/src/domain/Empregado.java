package domain;

public sealed abstract class Empregado permits Gerente, Vendedor {

    protected String nome;
    protected String id;
    protected String endereco;
    protected int idade;
    protected double salario;

    public Empregado(String nome, String id, String endereco, int idade, double salario) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.idade = idade;
        this.salario = salario;
    }

    public Empregado() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getSalarioTotal();
}
