package Exercicios;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, escolha = 0;

        while (escolha !=3) {
            System.out.println("1 - Para sequenciar um abaixo do outro");
            System.out.println("2 - Para sequenciar um ao lado do outro");
            System.out.println("3 - Sair");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1: {
                    do {
                        i = i + 1;
                        System.out.print(i + " ");
                        System.out.println(" ");
                    } while (i != 20);
                    i = 0;
                    break;
                }
                case 2: {
                    do {
                        i = i + 1;
                        System.out.print(i + " ");
                    } while (i != 20);
                    System.out.println(" ");
                    i = 0;
                    break;
                }
                case 3: {
                    System.out.println("Finalizado");
                    break;
                }
                default:
                    System.out.println("Numero invalido");
            }
        }
    }
}
