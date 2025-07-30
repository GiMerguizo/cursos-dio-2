import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner  = new Scanner(System.in); // Operador de atribuição =

        /*
        System.out.println("Quanto é 2 + 2? ");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou? (%s) \n", isRight);
        */

        System.out.println("Sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você é emancipado? ");
        var isEmancipated = scanner.nextBoolean();


        // var canDrive = idade > 17;
        var canDrive = idade >= 18 || (isEmancipated && idade >= 16); // || => operador "or" && => operador "and"
        // var canNotDrive = idade < 18;
        System.out.println("Você já pode dirigir? " + canDrive);
        // System.out.println("Certeza? " + !canNotDrive);

    }
}
