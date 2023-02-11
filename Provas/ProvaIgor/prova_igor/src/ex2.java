import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aumento = 0.015, salario = 1000, soma = 0;
        int ano = 1995;

        soma = salario;

        do {
            soma = soma + (salario * aumento);
            aumento = aumento + aumento;
            ano++;
        }while (ano <= 2022);
        ano --; //para diminuir um ano do contador para mostrar o ano de 2022 abaixo
        System.out.println("valor do salário em " + ano + " será: " + soma);
    }
}
