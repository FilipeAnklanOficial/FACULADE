package TrabalhoEstruturaDeDados;

public class ListaLigadaTB <T> {

    private NoTB<T> primeiro;
    private int tamanho;
    private NoTB<T> ultimo;

    public ListaLigadaTB() {
        primeiro = null;
        tamanho = 0;
    }

    public void adicionaInicio(T conteudo) {
        NoTB<T> novoNo = new NoTB<>(conteudo, null, null);
        if (tamanho != 0){
            primeiro.setAnterior(novoNo);
            novoNo.setProximo(primeiro);
            primeiro = novoNo;
        }else{
            primeiro = novoNo;
        }
        tamanho++;
    }

    public void adicionaFinal(T conteudo) {
        NoTB<T> novoNo = new NoTB<>(conteudo, null, null);
        if (tamanho != 0) {
            NoTB<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            novoNo.setAnterior(atual);
            atual.setProximo(novoNo);
            ultimo = novoNo;
        } else {
            primeiro = novoNo;
        }
        tamanho++;
    }

    public void mostrarNos() {
        if (tamanho != 0) {
            NoTB<T> atual = primeiro;
            int contador = 0;
            System.out.println("Mostrando Nos em ordem crescente");
            while (atual.getProximo() != null) {
                System.out.println("O conteudo do No na posicao " + contador + " e igual a: " + atual.getConteudo());
                atual = atual.getProximo();
                contador++;
            }
            System.out.println("O conteudo do No na posicao " + contador + " e igual a: " + atual.getConteudo());
        } else {
            System.out.println("Nao existe nenhum elemento na lista.");
        }
    }

    public void mostrarNosDecrescente() {
        if (tamanho != 0) {
            NoTB<T> atual = ultimo;
            int contador = 0;
            System.out.println("Mostrando Nos em ordem decrescente");
            while (atual.getAnterior() != null) {
                System.out.println("O conteudo do No na posicao " + contador + " e igual a: " + atual.getConteudo());
                atual = atual.getAnterior();
                contador++;
            }
            System.out.println("O conteudo do No na posicao " + contador + " e igual a: " + atual.getConteudo());
        } else {
            System.out.println("Nao existe nenhum elemento na lista.");
        }
    }

}
