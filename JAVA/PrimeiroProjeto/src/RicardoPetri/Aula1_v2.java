package RicardoPetri;

import java.util.Scanner;

public class Aula1_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticoes, tab = 5, resu,  i = 1;
        System.out.println("Indique até onde vai a tabuada: ");
        repeticoes = sc.nextInt();

        while (i <= repeticoes) {
            resu = i * tab;
            System.out.println(i + "x" + tab + "=" + resu);
            i = i + 1;
        }
    }
}
