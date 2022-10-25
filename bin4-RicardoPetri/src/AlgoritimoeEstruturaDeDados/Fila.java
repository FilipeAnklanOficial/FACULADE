package AlgoritimoeEstruturaDeDados;

public class Fila <T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private T conteudo;

    public Fila() {
        this.primeiro = this.ultimo = null;
    }

    public Fila (T conteudo){
        this.conteudo = conteudo;
        this.primeiro = this.ultimo = null;
    }

    public boolean vazia(){
        return primeiro == null;
    }

    public void enfileira (T conteudo){
        if(this.vazia()){
            //returno true
            primeiro = ultimo = new No<T>(conteudo,null);
        }else {
            //retorno false
            ultimo.setProximo(new No<T>(conteudo, null));
            ultimo = ultimo.getProximo();
        }
    }

    public T desenfileira() {
        if(this.vazia()){
            return null;
        }else {
            T aux = primeiro.getConteudo();
            if(primeiro == ultimo){
                primeiro = ultimo = null;
            }else{
                primeiro = primeiro.getProximo();
            }
            return aux;
        }
    }

    public void mostraFila(){
        if (!this.vazia()){
            No<T> atual = primeiro;
            int contador = 0;
            while(atual.getProximo() != null){
                System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
                atual = atual.getProximo();
                contador++;
            }
        }else {
            System.out.println("A fila está vazia");
        }
    }
}
