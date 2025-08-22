import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoas p1 = new Pessoas("João"); // Construtor

        // p1.setNome("João");
        // p1.setIdade(12);



        Pessoas p2 = new Pessoas("Maria");
        // p2.setNome("Maria");
        // p2.setIdade(23);

        System.out.println("Pessoa 1: " + p1.getNome() + " - Idade: " + p1.getIdade());
        System.out.println("Pessoa 2: " + p2.getNome() + " - Idade: " + p2.getIdade());
    }
}
