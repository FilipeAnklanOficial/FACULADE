package AlgoritimoeEstruturaDeDados.Arvores;

public class ExecutorArvore {
    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria();

        ab.inserir(20);
        ab.inserir(12);
        ab.inserir(14);
        ab.inserir(21);

        No raiz = ab.retornaRaiz();

        System.out.println("Pre Ordem:");
        ab.preOrdem(raiz);
        System.out.println(" ");
        System.out.println("Em Ordem");
        ab.emOrdem(raiz);
        System.out.println(" ");
        System.out.println("Pós Ordem");
        ab.posOrdem(raiz);
        System.out.println(" ");

        System.out.println("Altura da arvore: " + ab.altura(raiz));
        System.out.println("Quantidade de Folhas na arvore: " + ab.folhas(raiz));
        System.out.println("Quantidade e Nos na arvore: " + ab.contarNos(raiz));
        System.out.println("Menor elemento da arvore: " + ab.valorMinimo().getValor());
        System.out.println("Maior elemento da arvore: " + ab.valorMaximo().getValor());

        ab.remove(21);
    }
}
