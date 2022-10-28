package TrabalhoEstruturaDeDados;

public class Executor {
    public static void main(String[] args) {
        ListaLigadaTB listaLigadaTB = new ListaLigadaTB<>();

        listaLigadaTB.mostrarNos();
        System.out.println(" ");
        listaLigadaTB.mostrarNosDecrescente();
        listaLigadaTB.adicionaFinal(30);
        listaLigadaTB.adicionaInicio(10);
        listaLigadaTB.adicionaFinal(20);
        listaLigadaTB.adicionaInicio(40);
        listaLigadaTB.adicionaFinal(50);
        listaLigadaTB.adicionaInicio(60);
        listaLigadaTB.adicionaFinal(70);
        System.out.println(" ");
        listaLigadaTB.mostrarNos();
        System.out.println(" ");
        listaLigadaTB.mostrarNosDecrescente();
    }
}
