package lista2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Escreva o valor de A: ");
        a = scanner.nextInt();
        System.out.println("Escreva o valor de B: ");
        b = scanner.nextInt();
        System.out.println("Escreva o valor de C: ");
        c = scanner.nextInt();
        d = (a+b) ;
        if (d > c){
            System.out.println(a+b);
        } 
    }  
}
