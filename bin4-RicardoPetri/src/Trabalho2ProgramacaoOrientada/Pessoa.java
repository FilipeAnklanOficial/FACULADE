package Trabalho2ProgramacaoOrientada;

public class Pessoa{

    protected String nomeTitular;
    protected String cpf;
    protected String telefone;
    protected String dataNascimento;

    public Pessoa(String nomeTitular, String cpf, String telefone, String dataNascimento) {
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
