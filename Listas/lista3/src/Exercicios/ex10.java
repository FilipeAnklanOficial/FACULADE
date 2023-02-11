package Exercicios;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, i = 0;
        System.out.println("Insira o primeiro numero");
        n1 = sc.nextInt();
        System.out.println("Insira o segundo numero");
        n2 = sc.nextInt();

        i = n1;
        n2 = n2 - 1;
        while (i < n2){
            i++;
            System.out.print(i + " ");
        }

    }
}