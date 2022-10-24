package TrabalhoProgramacaoOrientada;

import java.util.Scanner;

public class Vetor {

    private int tamanho = 6;
    private int posicao = 0;
    private int [] vetor;

    public Vetor() {
        this.vetor = new int [this.tamanho];
    }

    public void Inserir(){
        Scanner sc = new Scanner(System.in);
        int valor, tamanhoVetor;
        tamanhoVetor = this.posicao;
        System.out.println("Qual valor deseja inserir?");
        valor = sc.nextInt();
        if (tamanhoVetor > 5){
            System.out.println(" ");
            System.out.println("Não há espaço no vetor");
            System.out.println(" ");
        }else {
            if (valor > 0) {
                vetor[this.posicao] = valor;
                System.out.println("Valor inserido");
                this.posicao++;
            } else {
                System.out.println("Valor incorreto, digite somente valores inteiros");
            }
        }
    }

    public void Remover(){
        Scanner sc = new Scanner(System.in);
        int posicao;
        System.out.println("Qual a posição que deseja remover?");
        posicao = sc.nextInt();
            if(posicao < 0 || posicao > 5){
                System.out.println("Valor incorreto, digite um valor inteiro entre 0 e 5");
            }else {
                vetor[posicao] = 0;
                for (int i = posicao; i < this.posicao; i++){
                    int aux = vetor[i + 1];
                    vetor[i] = aux;
                }
                this.posicao --;
            }
    }

    public void Buscar(){
        Scanner sc = new Scanner(System.in);
        int posicao;
        System.out.println("Qual posicao deseja Buscar?");
        posicao = sc.nextInt();
            if(posicao < 0 || posicao > 5){
                System.out.println("Valor incorreto, digite um valor inteiro entre 0 e 5");
            }else {
                System.out.println(" ");
                System.out.println(vetor[posicao]);
                System.out.println(" ");
            }
    }

    public void ImprimeVetor(){
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println("O valor da posição: " + i + " é: " + vetor[i]);
        }
    }
}