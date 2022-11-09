package ProgramacaoOrientadaAObjetos;

public class Secretaria extends Funcionario{
    private String anotacoes;

    public Secretaria() {
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
