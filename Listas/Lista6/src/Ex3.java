import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet [] = new int[10];
        int i, j, igual = 0;

        for(i = 0; i < 10; i++) {
            System.out.println("Digite o "+(i + 1)+" valor: ");
            vet[i] = in.nextInt();
        }

        for(i = 0; i < 10; i++) {
            for(j = 0; j < 9; j++) {
                if(vet[i] == vet[j] && j!=i) {
                    igual = vet[i];
                    System.out.println("numeros iguais " + igual);
                }
            }
        }
    }
}
