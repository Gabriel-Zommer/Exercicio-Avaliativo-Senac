import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        
        System.out.print("Digite a quantidade de pessoas: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("\nNome da " + i + "ª pessoa: ");
            String nome = input.next();

            System.out.print("Idade da " + i + "ª pessoa: ");
            int idade = input.nextInt();

            System.out.print("Sexo da " + i + "ª pessoa (M/F): ");
            char sexo = input.next().charAt(0);

            Pessoa pessoa = new Pessoa(nome, idade, sexo);
            pessoas.add(pessoa);
        }

        
        System.out.println("\nPessoas com idade maior que a primeira:");
        Pessoa primeira = pessoas.get(0);
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > primeira.getIdade()) {
                System.out.println(pessoa.getNome() + ", " + pessoa.getIdade() + " anos, sexo " + pessoa.getSexo());
            }
        }

        
        System.out.println("\nMulheres:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() == 'F') {
                System.out.println(pessoa.getNome() + ", " + pessoa.getIdade() + " anos");
            }
        }

        
        System.out.println("\nHomens com menos de 21 anos:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() == 'M' && pessoa.getIdade() < 21) {
                System.out.println(pessoa.getNome());
            }
        }
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }
}
