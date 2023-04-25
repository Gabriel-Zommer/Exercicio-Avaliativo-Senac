import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 1) {
            System.out.println("Menu:");
            System.out.println("1 - Fim");
            System.out.println("2 - Calcular raiz");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 2) {
                System.out.print("Digite um número real: ");
                double numero = sc.nextDouble();

                if (numero >= 0) {
                    double raiz = Math.sqrt(numero);
                    System.out.println("A raiz quadrada de " + numero + " é " + raiz);
                } else {
                    System.out.println("Número inválido. Digite um número não negativo.");
                }
            } else if (opcao != 1) {
                System.out.println("Opção inválida. Digite uma opção válida.");
            }
        }

        System.out.println("Fim do programa.");
        sc.close();
    }
}
