import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, menorAltura = Double.MAX_VALUE, maiorAltura = Double.MIN_VALUE;
        
        for (int i = 1; i <= 15; i++) {
            System.out.printf("Digite a altura da pessoa %d em metros: ", i);
            altura = sc.nextDouble();
            
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
        }
        
        System.out.printf("A menor altura do grupo é %.2f metros.%n", menorAltura);
        System.out.printf("A maior altura do grupo é %.2f metros.%n", maiorAltura);
        
        sc.close();
    }
}
