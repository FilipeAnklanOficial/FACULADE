package TrabalhoEstruturaDeDados;

public class ListaLigadaTB <T> {

    private NoTB<T> primeiro;
    private int tamanho;
    private NoTB<T> ultimo;

    public ListaLigadaTB() {
        primeiro = null;
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionaInicio(T conteudo) {
        NoTB<T> novoNo = new NoTB<>(conteudo, null);
        primeiro = novoNo;
        tamanho++;
    }

    public void adicionaFinal(T conteudo) {
        NoTB<T> novoNo = new NoTB<>(conteudo, null);
        if (tamanho == 0) {
            primeiro = novoNo;
        } else {
            NoTB<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            novoNo.setAnterior(atual);
            atual.setProximo(novoNo);
            ultimo = novoNo;
        }
        tamanho++;
    }

    public void mostraNos() {
        if (tamanho != 0) {
            NoTB<T> atual = primeiro;
            int contador = 0;
            //atual = atual.getProximo();
            while (atual.getProximo() != null) {
                System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
                atual = atual.getProximo();
                contador++;
            }
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
        } else {
            System.out.println("Não existe nenhum elemento na lista.");
        }
    }

    public void mostraNosDec() {
        if (tamanho != 0) {
            NoTB<T> atual = ultimo;
            int contador = 0;
            while (atual.getAnterior() != null) {
                System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
                atual = atual.getAnterior();
                contador++;
            }
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
        } else {
            System.out.println("Não existe nenhum elemento na lista.");
        }
    }

}
