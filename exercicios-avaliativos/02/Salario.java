import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorNominal, valorHorasExtras, valorINSS, salarioLiquido;
        int horasExtras;
        
        System.out.print("Digite o valor nominal do salário: ");
        valorNominal = sc.nextDouble();
        
        System.out.print("Digite a quantidade de horas extras: ");
        horasExtras = sc.nextInt();
        
        valorHorasExtras = (valorNominal / 176) * horasExtras * 1.5;
        valorINSS = valorNominal * 0.1;
        if (valorINSS > 150) {
            valorINSS = 150;
        }
        salarioLiquido = valorNominal + valorHorasExtras - valorINSS;
        
        System.out.printf("\nValor nominal do salário: R$ %.2f", valorNominal);
        System.out.printf("\nValor adicional devido a horas extras: R$ %.2f", valorHorasExtras);
        System.out.printf("\nValor descontado para o INSS: R$ %.2f", valorINSS);
        System.out.printf("\nSalário líquido resultante: R$ %.2f", salarioLiquido);
        
        sc.close();
    }

}
