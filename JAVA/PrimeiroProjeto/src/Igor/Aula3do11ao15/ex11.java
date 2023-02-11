package Igor.Aula3do11ao15;

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = 0;
        float meses = 0, anos = 0;

        System.out.println("Digite a quantidade de dias:");
        dias = sc.nextInt();
        System.out.println("Dias:" + dias);
        meses = dias / 30;
        anos = meses / 12;
        System.out.println("Dias sem acidente:" + dias);
        System.out.println("Meses sem acidente:" + meses);
        System.out.println("Anos sem acidente:" + anos);
    }
}
