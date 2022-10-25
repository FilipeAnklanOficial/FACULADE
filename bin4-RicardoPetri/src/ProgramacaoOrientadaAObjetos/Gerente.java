package ProgramacaoOrientadaAObjetos;

public class Gerente {
    private int senha;
    private int numeroFuncionariosGerenciados;

    public void especificoGerente(){
        System.out.println("metodo específico do gerente");
    }

    public Gerente(){

    }

    public Gerente (int cpf, String nome, double salario, int senha, int numeroFuncionariosGerenciados) {
        this.senha = senha;
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }
}
