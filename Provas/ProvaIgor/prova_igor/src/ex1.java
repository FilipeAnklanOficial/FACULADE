import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, i = 0;

        System.out.println("insira um valor");
        n1 = sc.nextInt();
        System.out.println("insira um valor");
        n2 = sc.nextInt();
        System.out.println("insira um valor");
        n3 = sc.nextInt();
        System.out.println("insira um valor");
        n4 = sc.nextInt();
        System.out.println("insira um valor");
        n5 = sc.nextInt();

        if (n1>n2 && n1>n3 && n1>n4 && n1>n5) {
            System.out.println("O maior número é o: " + n1);
        }else if (n2>n3 && n2>n4 && n2>n5) {
            System.out.println("O maior numero é o: " + n2);
        }else if (n3>n4 && n3>n5){
            System.out.println("O maior número é o: " + n3);
        }else if (n4>n5){
            System.out.println("O maior número é o: " + n4);
        }else {
            System.out.println("O maior número é o: " + n5);
        }

        if (n1<n2 && n1<n3 && n1<n4 && n1<n5) {
            System.out.println("O menor número é o: " + n1);
        }else if (n2<n3 && n2<n4 && n2<n5) {
            System.out.println("O menor numero é o: " + n2);
        }else if (n3<n4 && n3<n5){
            System.out.println("O menor número é o: " + n3);
        }else if (n4<n5){
            System.out.println("O menor número é o: " + n4);
        }else {
            System.out.println("O menor número é o: " + n5);
        }
    }
}
