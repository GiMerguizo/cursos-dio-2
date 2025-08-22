import domain.Empregado;
import domain.Gerente;
import domain.Vendedor;

public class Main {

    public static void main(String[] args) {
        // domain.Empregado empregado = new domain.Empregado();
        // domain.Gerente gerente = new domain.Gerente();
        // domain.Empregado gerente2 = new domain.Gerente(); // Polimorfismo

        /* gerente.setNome("Joao");
        gerente.setLogin("joana");
        gerente.setSenha("123456");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Login: " + gerente.getLogin());
        System.out.println("Senha: " + gerente.getSenha()); */

        printEmpregado(new Gerente());
        printEmpregado(new Vendedor());
    }

    public static void printEmpregado(Empregado empregado) {
        System.out.println("-=-=-=-=-=-=-=-=\n" + empregado.getClass().getCanonicalName() + "\n-----------");
/*        if  (empregado instanceof domain.Gerente gerente) { // verifica se o objeto é uma instância de uma determinada classe
            System.out.println("domain.Empregado domain.Gerente");
            empregado.setNome("Joana");
            // ((domain.Gerente)empregado).setLogin("joao");
            gerente.setLogin("joao");
            // ((domain.Gerente)empregado).setSenha("123456");
            gerente.setSenha("123456");


            System.out.println("Nome: " + empregado.getNome());
            // System.out.println("Login: " + ((domain.Gerente)empregado).getLogin());
            System.out.println("Login: " + gerente.getLogin());
            // System.out.println("Senha: " + ((domain.Gerente)empregado).getSenha());
            System.out.println("Senha: " + gerente.getSenha());
        }

        if  (empregado instanceof domain.Vendedor vendedor) {
            System.out.println("domain.Empregado domain.Vendedor");

        }*/

        switch(empregado) {
            case Gerente gerente -> {
                gerente.setId("123");
                gerente.setNome("João");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setSenha("123456");
                gerente.setComissao(1200);

                System.out.println(gerente.getId());
                System.out.println("Salário: " + gerente.getSalario());
                System.out.println("Nome: " + gerente.getNome());
                System.out.println("Login: " + gerente.getLogin());
                System.out.println("Senha: " + gerente.getSenha());
                System.out.println("Comissão: " + gerente.getComissao());
                System.out.println("Salário com Extra: " + gerente.getSalarioTotal(500));
            }
            case Vendedor vendedor -> {
                vendedor.setId("456");
                vendedor.setNome("Lucas");
                vendedor.setSalario(2800);
                vendedor.setPorcentagemPorVenda(10);
                vendedor.setMontante(1000);

                System.out.println(vendedor.getId());
                System.out.println("Salário: " + vendedor.getSalario());
                System.out.println("Nome: " + vendedor.getNome());
                System.out.println("Porcentagem por venda: R$ " + vendedor.getPorcentagemPorVenda());
                System.out.println("Montante: R$ " + vendedor.getMontante());
            }
        }
        System.out.println("Salário total: R$ " +  empregado.getSalarioTotal());

    }

}
