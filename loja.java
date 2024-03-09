import java.util.Scanner;

public class loja {

    private static int estoque = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean menu = true;

        while (menu) {
      System.out.println("--------------------------------------------"); 
      System.out.println("Escolha o numero da ação que será realizada");
      System.out.println("1. Quantidade no estoque");
      System.out.println("2. Adicionar produto ao estoque");
      System.out.println("3. Remover produto do estoque");  
      System.out.println("4. Sair");
      System.out.println("--------------------------------------------");
      int opcao = scanner.nextInt();
      
            switch (opcao) {
                case 1:
                    System.out.println(estoque + " produto(s) no estoque");
                    break;
                
                case 2:
                    System.out.println("Qual a quantidade será adicionada no estoque?");
                    int vadd = scanner.nextInt();
                    add(vadd);
                    break;

                case 3:
                    System.out.println("Qual a quantidade sera removida do estoque?");
                    int rmv = scanner.nextInt();
                    premovido(rmv);
                    break;

                case 4:
                    menu = false;
                    break;

                default:
                    break;

            }
        }
        scanner.close();
    }

        private static void add(int quantidade) {
            estoque +=  quantidade ;
            System.out.println("Agora o estoque é de: " + estoque + " produtos");
        }

        private static void premovido(int Quantidade) {
            estoque -= Quantidade;
            System.out.println("Agora o estoque é de: " + estoque +" produtos");
        }
    }
    