package domain;

import java.security.PublicKey;

public non-sealed class Gerente extends Empregado{

    private String login;
    private String senha;
    private double comissao;

    public Gerente(String nome, String id, String endereco, int idade, double salario, String login, String senha, double comissao) {
        super(nome, id, endereco, idade, salario);
        this.login = login;
        this.senha = senha;
        this.comissao = comissao;
    }

    @Override
    public String getId(){
        return "GR" + this.id;
    }

    public Gerente() {}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getSalarioTotal() {
        return this.salario + this.comissao;
    }

    public double getSalarioTotal(double extra) {
        return this.getSalarioTotal() + extra;
    }
}
