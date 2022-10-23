package TrabalhoProgramacaoOrientada;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Vetor vetor = new Vetor();

        do {
            System.out.println("Insira um valor para uma ação");
            System.out.println("1 - Para inserir dados");
            System.out.println("2 - Para Remover dados");
            System.out.println("3 - Para Buscar dados");
            System.out.println("4 - Para imprimir o vetor");
            System.out.println("9 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    vetor.Inserir();
                    break;
                case 2:
                    vetor.Remover();
                    break;
                case 3:
                    vetor.Buscar();
                    break;
                case 4:
                    vetor.ImprimeVetor();
                    break;
            }
        }while (opcao != 9);
    }
}
