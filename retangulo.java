import java.util.Scanner;

public class retangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("digite o comprimento do retângulo:");
        double comprimento = scanner.nextDouble();
        System.out.println("digite a largura do retângulo:");
        double largura = scanner.nextDouble();
    
        double area = comprimento * largura;
        double perimetro = 2 * (largura + comprimento);
    
        System.out.println("A área do seu retângulo é:" + area);
        System.out.println("O perimetro do seu retângulo é:" + perimetro);
        scanner.close();
    }
    
}