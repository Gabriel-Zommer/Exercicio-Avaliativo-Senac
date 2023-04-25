import java.util.Scanner;

public class CalculoPagamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À vista em dinheiro, débito ou pix");
        System.out.println("2 - À vista no cartão de crédito");
        System.out.println("3 - Em 2x sem juros");
        System.out.println("4 - Em 3x com juros");
        int formaPagamento = scanner.nextInt();
        
        double precoFinal = 0;
        
        switch (formaPagamento) {
            case 1:
                precoFinal = preco * 0.85;
                break;
            case 2:
                precoFinal = preco * 0.9;
                break;
            case 3:
                precoFinal = preco;
                break;
            case 4:
                precoFinal = preco * 1.1;
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                System.exit(0);
        }
        
        System.out.printf("Preço final: R$ %.2f", precoFinal);
        
        scanner.close();
    }

}
