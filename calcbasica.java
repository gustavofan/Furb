import java.util.Scanner;

public class calcbasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        for(int i = 0; i < 1000; i++) {
            System.out.println("    ");
        }
        
        System.out.println("Escolha um opção:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int menu = scanner.nextInt();
        
        switch (menu) {
            case 1:
                    double soma = num1 + num2;
                    System.out.println("O resultado é: " + soma);
                break;

            case 2:
                    double subtração = num1 - num2;
                    System.out.println("O resultado é: " + subtração);
                break;

            case 3:
                    double multiplicação = num1 * num2;
                    System.out.println("O resultado é: " + multiplicação);
                break;

            case 4:
                    if(num2 != 0) {
                        double divisão = num1 / num2;
                        System.out.println("O resultado é: " + divisão);
                    } else {
                        System.out.println("Não é possível dividir por zero");
                    }
                break;
        
            default:
                break;
        }
        scanner.close();
        }
    
    }


