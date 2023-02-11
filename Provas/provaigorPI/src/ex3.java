import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, m = 0, h = 0;
        double MI, MF, massa;

        System.out.println("Informe a massa");
        MI = sc.nextDouble();

        massa = MI;

        while (massa > 0.5){
            massa /= 2;
            s += 50;
        }
        MF = massa;
        while (s >= 60){
            s -= 60;
            m++;
        }
        while (m >= 60){
            m -= 60;
            h++;
        }
        System.out.println("Massa inicial: "+MI);
        System.out.println("Massa final: "+MF);
        System.out.println("Horas: "+h+" Minutos: "+m+" Segundos: "+s);
    }
}