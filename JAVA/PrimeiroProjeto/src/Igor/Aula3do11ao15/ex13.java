package Igor.Aula3do11ao15;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada, dezena, centena, unidade;

        System.out.println("Escreva um número com 3 algarismos:");
        entrada = sc.nextInt();

        if (entrada >= 999) {
            centena = entrada/100;
            dezena = (entrada-centena*100)/10;
            unidade = (entrada-centena*100-dezena*10);

            System.out.println("Centenas= " + centena);
            System.out.println("Dezenas= " + dezena);
            System.out.println("Unidades= " + unidade);
        }
    }
}
