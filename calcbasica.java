import java.util.Scanner;

public class calcbasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("A soma é " + (num1 + num2));
        System.out.println("A subtração é " + (num1 - num2));
        System.out.println("A multiplicação é " + (num1 * num2));
        if(num2 != 0) {
            System.out.println("A divisão é " + (num1 / num2));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    scanner.close();
    }
}