package ProgramacaoOrientadaAObjetos;

public class Exec {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Bruno", 1, 1000);
        System.out.println(conta1.getNomeTitular());
        System.out.println(conta1.getNumeroConta());
        System.out.println(conta1.getSaldo());

        Conta conta2 = new Conta("Filipe", 2, 300);
        System.out.println(conta2.getNomeTitular());
        System.out.println(conta2.getNumeroConta());
        System.out.println(conta2.getSaldo());

        conta1.deposito(250, conta2);
        System.out.println("saldo conta " + conta1.getNumeroConta() + ": " + conta1.getSaldo());
        System.out.println("saldo conta " + conta2.getNumeroConta() + ": " + conta2.getSaldo());
    }


}