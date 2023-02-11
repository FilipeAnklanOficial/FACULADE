package Exercicios;

import java.util.Objects;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;

        do {
            System.out.println("Insira o usuário");
            usuario = sc.next();
            System.out.println("Insira a senha");
            senha = sc.next();
            if (Objects.equals(senha, usuario)) {
                System.out.println("Digite um valor diferente do usuário.");
            }else {
                System.out.println("Certo");
            }
        } while (Objects.equals(usuario, senha));
    }
}
