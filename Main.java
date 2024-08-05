import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Cria conta b1
        Banco b1 = new Banco();
        b1.status();
        
        System.out.printf("\nDigite o numero da conta: ");
        b1.setNumDaConta(scan.nextInt());
        
        // Apenas para conseguir ler o nome do titular sem problemas
        scan.nextLine();
        
        System.out.printf("Digite o nome do titular: ");
        b1.setNomeDoTitular(scan.nextLine());
        
        char continuar = 'y';
        while (continuar == 'y') {
            System.out.printf("\nDeseja fazer uma operação? (y/n): ");
            continuar = scan.next().charAt(0);
            
            if (continuar == 'y') {
                System.out.printf("Escolha a operação:\n");
                System.out.printf("1 - Depósito Inicial\n");
                System.out.printf("2 - Depósito\n");
                System.out.printf("3 - Saque\n");
                System.out.printf("Opção: ");
                int opcao = scan.nextInt();
                
                switch(opcao) {
                    case 1:
                        System.out.printf("\nDigite o valor do depósito inicial: ");
                        b1.setDepositoInicial(scan.nextInt());
                        break;
                    case 2:
                        System.out.printf("\nDigite o valor do depósito: ");
                        b1.setSaldo(scan.nextInt());
                        break;
                    case 3:
                        System.out.printf("\nDigite o valor do saque: ");
                        b1.setSaldo((scan.nextInt())*-1);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
        
        System.out.println();
        b1.status();
    }
}