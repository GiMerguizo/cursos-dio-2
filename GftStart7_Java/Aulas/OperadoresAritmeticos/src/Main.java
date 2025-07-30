import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int value1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        int value2 = input.nextInt();

        // Soma
        System.out.printf("%s + %s = %s \n", value1, value2, value1 + value2);
        // Subtração
        System.out.printf("%s - %s = %s \n", value1, value2, value1 - value2);
        // Multiplicação
        System.out.printf("%s * %s = %s \n", value1, value2, value1 * value2);
        // Divisão
        System.out.printf("%s / %s = %s \n", value1, value2, value1 / value2);
        // Resto
        System.out.printf("%s %% %s = %s \n", value1, value2, value1 % value2);


        // Ordem de Precedência
        var value = 5 + 9 * 10 - 5 / 2;
        System.out.println(value);

        var test = (5 + 9) * (10 - 5) / 2;
        System.out.println(test);
        

        // Raiz quadrada
        System.out.printf("A raiz quadrada de %s é %s \n", value1, Math.sqrt(value1));
        // Potência
        System.out.printf("A potência de %s é %s \n", value1, Math.pow(value1, value2));
    }

}
