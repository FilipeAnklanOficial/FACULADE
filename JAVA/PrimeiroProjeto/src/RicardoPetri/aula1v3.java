package RicardoPetri;

import java.util.Scanner;

public class aula1v3 {
    public static void main(String[] args) {
        int contador = 0, i = 0, valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número para verificar se é primo ou não:");
        valor = sc.nextInt();

        while (i <= valor) {
            if (valor%i == 0) {
                contador = contador + 1;
            }
            if (contador > 2) {
                System.out.println("O número" + valor + " não é primo");
                break;
            } else {

            }
            i = i +1;
        }
        if (contador == 2) {
        System.out.println("O número" + valor + " é primo.");
     }
    }
}
