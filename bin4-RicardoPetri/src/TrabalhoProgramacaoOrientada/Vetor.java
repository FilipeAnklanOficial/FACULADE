package TrabalhoProgramacaoOrientada;

public class Vetor {

    private int tamanho;
    private int inserir;
    private int remover;
    private int buscar;
    private int [] vetor;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new int [tamanho];
    }

    public int getInserir() {
        return inserir;
    }

    public void setInserir(int inserir) {
        this.inserir = inserir;
    }

    public int getRemover() {
        return remover;
    }

    public void setRemover(int remover) {
        this.remover = remover;
    }

    public int getBuscar() {
        return buscar;
    }

    public void setBuscar(int buscar) {
        this.buscar = buscar;
    }
}
