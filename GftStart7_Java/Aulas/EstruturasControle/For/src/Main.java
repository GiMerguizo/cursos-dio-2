import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* for (;;) {
            System.out.println("Digite um nome: ");
            String nome = input.next();

            if (nome.equalsIgnoreCase("exit")) break;

            System.out.println(nome);
        } */

        for (var i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println("Fim da execução.");
                break;
            }

            System.out.println(i);
        }

        for (var i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ". " + args[i]);
        }

        for (var arg : args) {
            System.out.println(arg);
        }
    }
}
