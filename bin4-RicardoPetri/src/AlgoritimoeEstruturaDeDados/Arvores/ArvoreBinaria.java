package AlgoritimoeEstruturaDeDados.Arvores;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor){
        No novo = new No(valor, null, null);
        if (this.raiz == null){
            System.out.println("No com valor: " + novo.getValor()+ " inserido na Arvore");
            this.raiz = novo;
        }else{
            No atual = raiz;
            No pai;
            while (true){
                pai = atual;
                if(valor <= atual.getValor()) {
                    atual = atual.getEsquerda();
                    if (atual == null){
                        pai.setEsquerda(novo);
                        System.out.println("No com valor: " + novo.getValor() + " inserido a Esquerda");
                        return;
                    }
                }else {
                    atual = atual.getDireita();
                    if (atual == null) {
                        pai.setDireita(novo);
                        System.out.println("No com valor: " + novo.getValor() + " inserido a Direita");
                        return;
                    }
                }
            }
        }
    }

    public No retornaRaiz() {
        return this.raiz;
    }

    public void preOrdem (No atual) {
        if(atual != null){
            System.out.print(atual.getValor()+ " ");
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void emOrdem(No atual){
        if (atual != null){
            emOrdem(atual.getEsquerda());
            System.out.print(atual.getValor() + " ");
            emOrdem(atual.getDireita());
        }
    }

    public void posOrdem(No atual){
        if (atual != null){
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.print(atual.getValor() + " ");
        }
    }

    public int altura(No atual){
        if (atual == null || (atual.getEsquerda() == null && atual.getDireita() == null)){
            return 0;
        }else{
            if (altura(atual.getEsquerda()) > altura(atual.getDireita())){
                return (1 + altura(atual.getEsquerda()));
            }else{
                return (1 + altura(atual.getDireita()));
            }
        }
    }

    public int folhas(No atual){
        if (atual == null){
            return 0;
        }
        if (atual.getEsquerda() == null && atual.getDireita() == null){
            return 1;
        }
        return folhas(atual.getEsquerda()) + folhas(atual.getDireita());
    }

    public int contarNos(No atual){
        if (atual == null){
            return 0;
        }else {
            return (1 + contarNos(atual.getEsquerda()) + contarNos(atual.getDireita()));
        }
    }

    public No valorMinimo(){
        No atual = this.raiz;
        No pai = null;
        while (atual != null){
            pai = atual;
            atual = atual.getEsquerda();
        }
        return pai;
    }

    public No valorMaximo(){
        No atual = this.raiz;
        No pai = null;
        while (atual != null){
            pai = atual;
            atual = atual.getDireita();
        }
        return pai;
    }

    public boolean remove (int valor){
        if (this.raiz == null){
            System.out.println("Arvore vazia");
            return false;
        }

        No atual = raiz;
        No pai = raiz;
        boolean filhoEsquerda = true;

        while (atual.getValor() != valor){
            pai = atual;
            if(valor < atual.getValor()){
                atual = atual.getEsquerda();
                filhoEsquerda = true;
            }else {
                atual = atual.getDireita();
                filhoEsquerda = false;
            }
            if (atual == null){
                return false;
            }
        }
        if (atual.getEsquerda() == null && atual.getDireita() == null){
            if (atual == raiz){
                raiz = null;
            }else if (filhoEsquerda){
                pai.setEsquerda(null);
            }else {
                pai.setDireita(null);
            }
        }else if (atual.getDireita() == null){
            if (atual == raiz){
                raiz = raiz.getEsquerda();
            }else if(filhoEsquerda){
                pai.setEsquerda(atual.getEsquerda());
            }else{
                pai.setDireita(atual.getEsquerda());
            }
        }else if (atual.getEsquerda() == null){
            if (atual == raiz) {
                raiz = raiz.getDireita();
            }else if (filhoEsquerda){
                pai.setEsquerda(atual.getDireita());
            }
        }
    }
}