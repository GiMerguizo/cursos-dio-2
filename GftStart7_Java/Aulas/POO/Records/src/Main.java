public class Main {
    public static void main(String[] args) {
        Pessoas pessoa =  new Pessoas("João", 12);

        System.out.println(pessoa);
        System.out.println(pessoa.nome());
        System.out.println(pessoa.age());

        var newPessoa = new Pessoas(pessoa.nome(), 23);
        System.out.println(newPessoa);

        System.out.println(pessoa.getInfo());
    }
}
