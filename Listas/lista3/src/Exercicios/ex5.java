package Exercicios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hb1, tx1, hb2, tx2;
        int i = 0, escolha = 0;

        while (escolha !=2){
            System.out.println("1 - Introduzir dados");
            System.out.println("2 - Sair");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                System.out.println("Escreva a quantidade da primeira populacao: ");
                    hb1 = sc.nextDouble();
                System.out.println("Escreva a taxa de crescimento da primeira populacao: ");
                    tx1 = sc.nextDouble();
                System.out.println("Escreva a quantidade da segunda populacao");
                    hb2 = sc.nextDouble();
                while (hb2 <= hb1){
                    System.out.println("O valor da segunda populacao nao pode ser menor ou igual a primeira");
                    System.out.println("Indique um novo valor para a segunda populacao: ");
                    hb2 = sc.nextDouble();
                }
                System.out.println("Escreva a taxa de crescimento da segunda populacao: ");
                    tx2 = sc.nextDouble();
                while (tx2 >= tx1){
                    System.out.println("Se a taxa de crescimento da segunda populacao for maior ou igual a primeira," +
                    " automaticamente a primeira populacao nao ultrapassará a segunda");
                    System.out.println("Indique uma nova taxa para a segunda populacao");
                    tx2 = sc.nextDouble();
                }
                while (hb1 < hb2) {

                    hb1 = hb1 * tx1 + hb1;
                    hb2 = hb2 * tx2 + hb2;
                    i++;
                }
                    System.out.println("será necessários: " + i + " anos");
                break;
                case 2:
                    System.out.println("Finalizado!");
                break;
                default:
                    System.out.println("Numero incorreto");
            }
        }
    }
}

