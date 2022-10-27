package TrabalhoEstruturaDeDados;

public class Executor {
    public static void main(String[] args) {
        ListaLigadaTB listaLigadaTB = new ListaLigadaTB<>();

        listaLigadaTB.adicionaInicio(10);
        listaLigadaTB.adicionaFinal(20);
        listaLigadaTB.adicionaFinal(30);
        System.out.println(" ");
        listaLigadaTB.mostraNos();
        System.out.println(" ");
        listaLigadaTB.mostraNosDec();
    }
}
