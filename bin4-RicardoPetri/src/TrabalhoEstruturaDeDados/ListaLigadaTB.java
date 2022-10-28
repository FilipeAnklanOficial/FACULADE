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
            int c = 0;
            System.out.println("Mostrando Nos em ordem crescente");
            while (atual.getProximo() != null) {
                System.out.println("Posicao " + c + " Conteudo: " + atual.getConteudo());
                atual = atual.getProximo();
                c++;
            }
            System.out.println("Posicao " + c + " Conteudo: " + atual.getConteudo());
        } else {
            System.out.println("A lista esta vazia.");
        }
    }

    public void mostrarNosDecrescente() {
        if (tamanho != 0) {
            NoTB<T> atual = ultimo;
            int c = 0;
            System.out.println("Mostrando Nos em ordem decrescente");
            while (atual.getAnterior() != null) {
                System.out.println("Posicao " + c + " Conteudo: " + atual.getConteudo());
                atual = atual.getAnterior();
                c++;
            }
            System.out.println("Posicao " + c + " Conteudo: " + atual.getConteudo());
        } else {
            System.out.println("A lista esta vazia.");
        }
    }

}
