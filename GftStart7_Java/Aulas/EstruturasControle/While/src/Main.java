import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "";

        while (!nome.equals("exit")) {
            System.out.println("Digite seu nome: ");
            nome = input.next();
            System.out.println(nome);
        }

        do {
            System.out.println("Digite seu nome: ");
            nome = input.next();
            System.out.println(nome);

        } while (!nome.equalsIgnoreCase("exit"));
    }
}
