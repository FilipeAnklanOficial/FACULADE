package Igor.Aula3do11ao15;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioin, aumento, desconto, salariobt, salariodesc, salariolq;
        System.out.println("Informe o salário:");
        salarioin = sc.nextFloat();
        aumento = 15;
        desconto = 8;
        salariobt = (salarioin * aumento) / 100 + salarioin;
        salariodesc = (salariobt * desconto) / 100;
        salariolq = salariobt - salariodesc;
        System.out.println("Salário Inicial: " + salarioin);
        System.out.println("Salário bruto: " + salariobt);
        System.out.println("Salário líquido: " + salariolq);

    }
}
