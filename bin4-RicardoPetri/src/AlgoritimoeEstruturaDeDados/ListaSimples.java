package AlgoritimoeEstruturaDeDados;

public class ListaSimples {
    private int tamanho;
    private int [] valores;

    public ListaSimples(){
        System.out.println("Construtor vazio.");
    }

    public ListaSimples(int tamanho){
        System.out.println("Construtor com parâmetro.");
        this.tamanho = tamanho;
        this.valores = new int [this.tamanho];
    }

    public int adiciona(int valor, int posicao){
        if(posicao >= 0 && posicao < valores.length) {
            valores[posicao] = valor;
            System.out.println("O valor: " + valor + " foi adicionado.");
            return valor;
        } else {
            System.out.println("Não foi possível adicionar o elemento na posição solicitada");
            return -1;
        }

    }

    public int remove(int posicao) {
        int aux;
        if(posicao >= 0 && posicao < valores.length) {
            aux = valores[posicao];
            valores[posicao] = 0;
            System.out.println("O valor: " + aux + " foi removido.");
            return aux;
        } else {
            System.out.println("Não foi possível remover o elemento na posição solicitada");
            return -1;
        }
    }

    public void exibeLista() {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

    public void mostrar(){
        System.out.println("Método interno da classe Lista Simples.");
    }

}