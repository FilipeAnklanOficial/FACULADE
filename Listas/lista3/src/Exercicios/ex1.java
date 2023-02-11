package Exercicios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Insira um valor de 1 a 10 ");
            nota = sc.nextInt();
            if (nota<0 || nota>10) {
                System.out.println("Valor incorreto.");
            }
        } while (nota < 0 || nota >= 10);
            System.out.println("Valor correto.");
    }
}
