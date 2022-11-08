package TesteAbstract;

public abstract class Pessoa {
    protected String Nome;
    protected String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone) {
        Nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
