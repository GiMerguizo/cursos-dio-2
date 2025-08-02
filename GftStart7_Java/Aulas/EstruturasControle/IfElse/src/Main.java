import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Você é Emancipado? [S/N]");
        var isEmancipated = input.next().equalsIgnoreCase("S");

        System.out.printf("\nOlá, %s! \n", nome);
        // if (idade >= 18) System.out.printf("Você tem %s anos, portanto pode dirigir. \n", idade);
         /* if (idade >= 18) {
            System.out.printf("Você tem %s anos, portanto pode dirigir. \n", idade);
        } else if (idade >= 16 && isEmancipated) {
            System.out.printf("Apesar de ter %s anos, você é Emancipado, portanto pode dirigir. \n", idade);
        } else {
            System.out.printf("Você tem %s anos, portanto NÃO pode dirigir. \n", idade);
        }*/

        var canDrive = (idade >= 18) || (idade >= 16 && isEmancipated);
        var message = canDrive ?
                nome + ", você pode dirigir. \n" :
                nome + ", você NÃO pode dirigir. \n";

        System.out.println(message);
        System.out.println("\n--- Fim do Programa ---");
    }
}
