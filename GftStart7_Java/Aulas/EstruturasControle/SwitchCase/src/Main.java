import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");
        int option = input.nextInt();
         /* switch (option) {
            case 1:
            case 7:
                System.out.println("Final de Semana!");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção inválida!");
        } */

        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semanaa!", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida!";
        };
        System.out.println(message);
    }
}
