package Igor;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        float valorflutuante;
        String nome = new String();

        System.out.println("Informe um valor inteiro:");
        valor = sc.nextInt();
        System.out.println("O valor lido foi: " + valor + ". O programa será encerrado");

        System.out.println("Informe um valor flutuante");
        valorflutuante = sc.nextFloat();
        System.out.println("O valor lido foi: " + valorflutuante + ". O programa será encerrado");

        System.out.println("informe um nome: ");
        nome = sc.next();
        System.out.println("O nome inserido foi: " + nome);
    }
}