package ProgramacaoOrientadaAObjetos;

public class Gerente extends Funcionario implements iFuncionarioAutenticacao{
    private int senha;
    private int numeroFuncionariosGerenciados;

    public Gerente() {
    }

    public Gerente(int cpf, String nome, double salario, int senha, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    @Override
    public double getBonificacao() {
        return this.getSalario()*0.15 + 1000.0;
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



    public void especificoGerente(){
        System.out.println("Esse método é especifico de Gerente.");
    }

    @Override
    public boolean autenticar() {
        return true;
    }

    @Override
    public boolean estaAutenticado() {
        return false;
    }

    @Override
    public void desautentica() {

    }
}
