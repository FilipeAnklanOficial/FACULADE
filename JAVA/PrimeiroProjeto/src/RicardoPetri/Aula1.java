package RicardoPetri;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int elemento1, elemento2;

        System.out.println("Insira o valor do primeiro elemento: ");
        elemento1 = sc.nextInt();
        System.out.println("O valor do primeiro elemento é: " + elemento1 );

        System.out.println("Insira o valor do segundo elemento: ");
        elemento2 = sc.nextInt();
        System.out.println("O valor do segundo elemento é: " + elemento2 );

        System.out.println("A soma do elemento 1: " + elemento1 + " + o elemento 2: " + elemento2 + " é igual à: " + elemento1+elemento2);

    }
}
