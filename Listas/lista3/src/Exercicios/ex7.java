package Exercicios;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n1, n2, n3, n4, n5;
        System.out.println("Digite o valor do numero 1");
        n1 = sc.nextInt();
        System.out.println("Digite o valor do numero 2");
        n2= sc.nextInt();
        System.out.println("Digite o valor do numero 3");
        n3 = sc.nextInt();
        System.out.println("Digite o valor do numero 4");
        n4 = sc.nextInt();
        System.out.println("Digite o valor do numero 5");
        n5 = sc.nextInt();

        if (n1 >n2 && n1 > n3 && n1 > n4 && n1  > n5){
            System.out.println("o maior numero é o 1º: " + n1);
        } else if (n2 > n1 && n2 > n3 && n2 > n4 && n2  > n5){
            System.out.println("o maior numero é o 2º: " + n2);
        } else if (n3 > n2 && n3 > n1 && n3 > n4 && n3  > n5){
            System.out.println("o maior numero é o 3º: " + n3);
        } else if (n4 > n2 && n4 > n3 && n4 > n1 && n4  > n5){
            System.out.println("o maior numero é o 4º: " + n4);
        } else {
            System.out.println("o maior numero é o 5º: " + n5);
        }
    }
}
