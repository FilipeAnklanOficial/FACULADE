import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] num = new float[10];
        int i = 0;
        float soma = 0;

        for (i = 0; i < 10; i++){
            System.out.println("insira um valor: ");
            num[i] = sc.nextFloat();
        }

        for (i = 0; i < 10; i++){
            if (num[i] < 0){
                System.out.println("Negativos: " +  num[i]);
            }else{
                soma = soma + num[i];
                System.out.println("Positivos: " +  num[i]);
            }
        }
        System.out.println("A soma dos números positivos: " + soma);
    }
}
