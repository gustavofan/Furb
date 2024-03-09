import java.util.Scanner;

public class contabanco {
    
    // variavel saldo inicial = 0
    private static double saldo = 0.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //para fazer o loop do menu
        boolean continuar = true;

        //menu
        while (continuar) {
        System.out.println("-----------------------------------------------");
        System.out.println("Digite o número da ação que será realisada:");
        System.out.println("1. Número da conta");
        System.out.println("2. Saldo da conta");
        System.out.println("3. Depositar Valor");
        System.out.println("4. Sacar valor");
        System.out.println("5. Sair");
        System.out.println("-----------------------------------------------");
        int opcao = scanner.nextInt();


        //opções de escolha
       switch (opcao) {
        case 1:
            System.out.println("O número da sua conta é: 12345678");
            break;
            

        case 2:
            System.out.println("Você tem " + saldo  + " R$ de saldo");
            break;
            

        case 3:
            System.out.println("Qual valor você deseja depositar?");
            double vdeposito = scanner.nextDouble();
            depositar(vdeposito);
            break;
            

        case 4:
            System.out.println("Qual valor você deseja sacar?");
            double vsacado = scanner.nextDouble();
            valorsacado(vsacado);
            break;
        
        case 5:
            continuar = false;
            break;
            
       
        default:
        System.out.println("Essa opção não é válida");
            break;
       }
    }
        

      scanner.close();  
    }

    //valor do saldo + valor depositado
    private static void depositar(double valor) {
        saldo += valor;
        System.out.println("Seu saldo agora é: " + saldo + " R$");
    }

    //valor do saldo - valor sacado 
    private static void valorsacado(double Valor) {
        saldo -= Valor;
        System.out.println("Seu saldo agora é: " + saldo + " R$");
  
    }
}
