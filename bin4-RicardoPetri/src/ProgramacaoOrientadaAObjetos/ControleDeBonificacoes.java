package ProgramacaoOrientadaAObjetos;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f) {
        this.totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}