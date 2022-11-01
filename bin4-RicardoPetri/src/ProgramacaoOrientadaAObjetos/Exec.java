package ProgramacaoOrientadaAObjetos;

public class Exec {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Bruno", 1, 1000, "Conta-corrente");
        System.out.println(conta1.getNomeTitular());
        System.out.println(conta1.getNumeroConta());
        System.out.println(conta1.getSaldo());

        Conta conta2 = new Conta("Filipe", 2, 300, "Conta-Poupança");
        System.out.println(conta2.getNomeTitular());
        System.out.println(conta2.getNumeroConta());
        System.out.println(conta2.getSaldo());
    }
}