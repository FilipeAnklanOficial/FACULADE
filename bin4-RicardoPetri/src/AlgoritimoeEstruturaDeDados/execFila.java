package AlgoritimoeEstruturaDeDados;

public class execFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println(fila.vazia());
        fila.enfileira(10);
        System.out.println(fila.vazia());
        fila.mostraFila();
        fila.enfileira(20);
        fila.mostraFila();
        fila.desenfileira();
        fila.mostraFila();
    }
}
