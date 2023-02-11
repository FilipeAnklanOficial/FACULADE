package Exercicios;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5, soma, media;

        System.out.println("Insira o valor do numero 1");
        n1 = sc.nextInt();
        System.out.println("Insira o valor do numero 2");
        n2 = sc.nextInt();
        System.out.println("Insira o valor do numero 3");
        n3 = sc.nextInt();
        System.out.println("Insira o valor do numero 4");
        n4 = sc.nextInt();
        System.out.println("Insira o valor do numero 5");
        n5 = sc.nextInt();

        soma = n1+n2+n3+n4+n5;
        System.out.println("Soma: " + soma);
        media = soma/5;
        System.out.println("Média: " + media);
    }
}
