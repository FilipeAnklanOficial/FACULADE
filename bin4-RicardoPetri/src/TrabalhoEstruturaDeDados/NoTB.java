package TrabalhoEstruturaDeDados;

public class NoTB<T>{
    private T conteudo;
    private NoTB<T> proximo;
    private NoTB<T> anterior;


    public NoTB(T conteudo, NoTB<T> proximo) {
        this.conteudo = conteudo;
        this.proximo = proximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoTB<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoTB<T> proximo) {
        this.proximo = proximo;
    }

    public NoTB<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoTB<T> anterior) {
        this.anterior = anterior;
    }
}