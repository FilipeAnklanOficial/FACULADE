package Aula1;

public class ListaSimplesAula1 {
    private int tamanho;
    private int [] valores;

    public ListaSimplesAula1(){
        System.out.println("Construtor vazio");
    }

    public ListaSimplesAula1 (int tamanho){
        System.out.println("Construtor com parâmetro");
        this.tamanho = tamanho;
        this.valores = new int [this.tamanho];
    }

    public void adiciona(){

    }

    public void mostrar (){
        System.out.println("Método interno da classe Lista Simples");
    }

    public boolean estaVazia(){
        if(this.tamanho == 0){
            return true;
        }else {
            return false;
        }
    }
}
