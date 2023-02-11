package Igor;

import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
        String nome;
        int idade;
        double valor;
        boolean bool;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome");
        nome = sc.nextLine();
        System.out.println("informe sua idade");
        idade = sc.nextInt();
        System.out.println("Informe seu salário");
        valor = sc.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }
}
