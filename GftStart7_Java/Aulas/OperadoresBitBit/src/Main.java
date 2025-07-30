import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        var value1 = input.nextInt();
        System.out.println("Segundo valor: ");
        var value2 = input.nextInt();

        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("\nPrimeiro número %s (representação binária %s)\n", value1, binary1);

        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Primeiro número %s (representação binária %s)\n\n", value2, binary2);

        // Operador "or" |
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

        // Operador "and" &
        var result2 = value1 & value2;
        var binaryResult2 = Integer.toBinaryString(result2);
        System.out.printf("%s & %s = %s (representação binária %s)\n", value1, value2, result2, binaryResult2);

        // Compara se os bits são iguais
        var result3 = value1 ^ value2;
        var binaryResult3 = Integer.toBinaryString(result3);
        System.out.printf("%s ^ %s = %s (representação binária %s)\n", value1, value2, result3, binaryResult3);

        // Inverte os valores dos bits (Ex.: 1001 => 0110)
        var result4 = ~value1;
        var binaryResult4 = Integer.toBinaryString(result4);
        System.out.printf("~%s = %s (representação binária %s)\n", value1, result4, binaryResult4);

        // Deslocamento de bits (Signed Left Shift Operator)
        var result5 = value1 << value2;
        var binaryResult5 = Integer.toBinaryString(result5);
        System.out.printf("%s << %s = %s (representação binária %s)\n", value1, value2, result5, binaryResult5);

        // Deslocamento de bits (Signed Right Shift Operator)
        var result6 = value1 >> value2;
        var binaryResult6 = Integer.toBinaryString(result6);
        System.out.printf("%s >> %s = %s (representação binária %s)\n", value1, value2, result6, binaryResult6);

        // Deslocamento de bits (Unsigned Right Shift Operator)
        var result7 = value1 >>> value2;
        var binaryResult7 = Integer.toBinaryString(result7);
        System.out.printf("%s >>> %s = %s (representação binária %s)\n", value1, value2, result7, binaryResult7);
    }

}
