package ProgramacaoOrientadaAObjetos;

public class Secretaria extends Funcionario{
    private String anotacoes;

    public Secretaria() {
    }

    public Secretaria(String nome, int cpf, double salario, String anotacoes) {
        super(nome, cpf, salario);
        this.anotacoes = anotacoes;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    @Override
    public double getBonificacao() {
        return this.getSalario()*0.10 + 500;
    }
}
