package Exercicios;

public class ex4 {
    public static void main(String[] args) {
        double hb1 = 80000, tx1 = 0.03, hb2 = 200000, tx2 = 0.015;
        int i = 0;

        while (hb1 < hb2) {
            hb1 = hb1 * tx1 + hb1;
            hb2 = hb2 * tx2 + hb2;
            i++;
        }
        System.out.println(hb1 + " " + hb2);
        System.out.println("será necessários: " + i + " anos");
    }
}
