// No Record, os valores são imutaveis

public record Pessoas(String nome, int age) {

    /* public Pessoas {
        System.out.println("============");
        System.out.println(nome);
        System.out.println(age);
        System.out.println("============");
    }*/

    public Pessoas(String nome) {
        this(nome,1);
    }

    public String getInfo() {
        return "Name: " + nome + ", Age: " + age;
    }

}
