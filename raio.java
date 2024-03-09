import java.util.Scanner;

public class raio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a área do circulo:");
	double area = scanner.nextDouble();

	double raio = Math.sqrt(area / 3.14);

	System.out.println("O raio do seu circulo é:" + raio);
    scanner.close();
}
}
