package Igor;

import java.awt.*;
import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int esc = 0, num1, num2, result = 0;

        System.out.println("Escreva o primeiro número");
        num1 = sc.nextInt();
        System.out.println("Escreva o Segundo número");
        num2 = sc.nextInt();

        System.out.println("Indique a ação");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - divisão");
        System.out.println("4 - multiplicação");
        esc = sc.nextInt();
            if (esc == 1) {
                result = num1 + num2;
                System.out.println("Resultado: " + result);
            }else if (esc == 2) {
                result = num1 - num2;
                System.out.println("Resultado: " + result);
            }else if (esc == 3) {
                result = num1 / num2;
                System.out.println("Resultado: " + result);
            }else if (esc == 4) {
                result = num1 * num2;
                System.out.println("Resultado: " + result);
            }
        }
    }
