package Aula1;

import java.util.Scanner;

public class Conta {
    Scanner sc = new Scanner(System.in);
    private String nomeTitular;
    private int numeroConta;
    private double saldo;
    private double saque;
    //contrutor vazio

    public Conta() {

    }

    //construtor com parâmetro


    public Conta(String nomeTitular, int numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o Titular");
        nomeTitular = sc.next();
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) {
        if (valor > 0) {
            if (this.saldo < valor) {
                System.out.println("Saldo insuficiente");
            }else{
                this.saldo = this.saldo - valor;
            }
        } else {
            System.out.println("impossivel sacar um valor negativo");
        }
    }
}

