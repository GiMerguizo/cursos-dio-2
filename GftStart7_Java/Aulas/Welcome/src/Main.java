import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Hello World!";

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);
        // Comentários

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Qual é o seu nome? ");
        String name = scanner.next();

        System.out.println("Seja Bem-vind@, " + name + "!");

        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.printf("Uau! Você já tem %d anos. \n", age);
    }

/*
* Comentários de várias linhas
*
*/

/**
 * Documentação
 *
 * */

}
