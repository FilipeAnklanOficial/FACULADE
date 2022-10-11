package Aula1;

import java.util.Scanner;

public class ExecConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o Nome do Titular");

//        Conta conta = new Conta("Filipe", 1, 1500);
//        System.out.println("Nome: " + conta.getNomeTitular());
//        System.out.println("Conta: " + conta.getNumeroConta());
//        System.out.println("Saldo: " + conta.getSaldo());

        Conta conta2 = new Conta("Bruno", 2, 500);
        System.out.println("Nome: " + conta2.getNomeTitular());
        System.out.println("Conta: " + conta2.getNumeroConta());
        System.out.println("Saldo: " + conta2.getSaldo());

        conta2.saque (600.0);
        System.out.println(conta2.getSaldo());
    }
}
