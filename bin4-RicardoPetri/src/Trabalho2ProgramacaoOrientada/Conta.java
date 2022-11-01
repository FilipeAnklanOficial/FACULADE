package Trabalho2ProgramacaoOrientada;

public class Conta extends Pessoa {

    private int numeroConta;
    private double saldo;
    private String tipoConta;

    public Conta(String nomeTitular, String cpf, String telefone, String dataNascimento, int numeroConta, double saldo, String tipoConta) {
        super(nomeTitular, cpf, telefone, dataNascimento);
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void saque(double valor) {
        if (valor > 0) {
            if (this.saldo < valor) {
                System.out.println("Não é possível sacar um valor maior do que o saldo.");
            } else {
                this.saldo = this.saldo - valor;
                System.out.println("Saque de: " + valor + " concluido com sucesso");
            }
        } else {
            System.out.println("Impossível sacar um valor negativo.");
        }

    }

    public void deposito(double valor, Conta conta) {
        if(valor > 0) {
            conta.saldo = conta.saldo + valor;
            System.out.println("Depósito de: " + valor + " concluído com sucesso.");
        } else {
            System.out.println("Não é possível depositar valores negativos ou iguais a 0.");
        }
    }

    public void transfere(Conta contaDestino, double valor) {
        if(valor > 0  && valor <= this.saldo) {
            contaDestino.saldo += valor;
            this.saldo -= valor;
            System.out.println("Transferência de: " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Não é possível transferir valores negativos ou iguais a 0.");
        }
    }

    public void imprimeDados(){
        System.out.println("Nome: " + this.nomeTitular);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone:" + this.telefone);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("Tipo de Conta: " + this.tipoConta);
        System.out.println("Saldo: " + this.getSaldo());
    }

    public void devolveSaldo(){
        System.out.println("Conta: " + this.numeroConta +  "  Saldo atual: " + this.saldo);
    }
}