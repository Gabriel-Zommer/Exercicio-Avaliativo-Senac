import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Menu Principal");
            System.out.println("1 - Fim");
            System.out.println("2 - Cadastro");
            System.out.println("3 - Consulta");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Opção Fim selecionada!");
                    break;
                case 2:
                    System.out.println("Opção Cadastro selecionada!");
                    break;
                case 3:
                    System.out.println("Opção Consulta selecionada!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
            System.out.println();
        } while (opcao != 1);
        
        System.out.println("Programa finalizado!");
    }

}
