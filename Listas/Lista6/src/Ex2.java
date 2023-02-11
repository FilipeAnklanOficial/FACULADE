import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numMaior = 0;
        int numMenor = 0;
        int n1 = 1;
        int[] lerNum;
        int soma = 0;
        int cont = 1;


        lerNum = new int[5];

        for(n1 = 0; n1 < 5; n1++) {

            System.out.println("Digite o "+ cont +"° número: ");
            lerNum[n1] = in.nextInt();

            numMaior = lerNum[n1];
            numMenor = lerNum[n1];
            cont++;

            soma = soma + lerNum[n1];
        }
        for(n1 = 0; n1 < 5; n1++) {
            if (lerNum[n1] > numMaior) {
                numMaior = lerNum[n1];
            } else if (lerNum[n1] < numMenor) {
                numMenor = lerNum[n1];
            }
            System.out.println("Valores: "+lerNum[n1]);
        }

        System.out.println();
        System.out.println("O maior número é: "+numMaior);
        System.out.println("O menor número é: "+numMenor);
        System.out.println("Média: "+(soma/n1));
    }
}
