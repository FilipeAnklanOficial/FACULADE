package Exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, sexo , estado;
        int idade, salario;

        System.out.println("Digite seu nome: ");
        name = sc.nextLine();
        while (name.length()<3){
            System.out.println("Nome menor que 3 caracteres");
            System.out.print("Digite seu nome: ");
            name = sc.nextLine();
        }
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        while (idade>150 || idade<0){
            System.out.println("Idade invalida");
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

        }
        System.out.println("Digite seu salário: ");
        salario = sc.nextInt();
        while (salario< 0){
            System.out.println("Valor inválido");
            System.out.println("Digite seu salário: ");
            salario = sc.nextInt();
        }
        System.out.println("Digite seu sexo entre f e m: ");
        sexo = sc.nextLine();

        while(! sexo.equals("f") && ! sexo.equals("m")){
            System.out.println("Digite seu sexo");
            sexo = sc.nextLine();
        }

        System.out.println("Digite seu Estado civil entre s, c, v e d: ");
        estado = sc.nextLine();
        while(! estado.equals("s") && ! estado.equals("c") && ! estado.equals("v") && ! estado.equals("d") ){
            System.out.println("Estádo civil inválido.");
            System.out.println("Digite seu Estado civil entre s, c, v e d: ");
            estado = sc.nextLine();
        }
    }
}