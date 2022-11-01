package Trabalho2ProgramacaoOrientada;

public class Executor {
    public static void main(String[] args) {
        Trabalho2ProgramacaoOrientada.Conta conta1 = new Trabalho2ProgramacaoOrientada.Conta
        ("Bruno", "125.684.629-01", "(43)999663321", "12/05/2001", 1, 5000, "Conta-Corrente");

        Trabalho2ProgramacaoOrientada.Conta conta2 = new Trabalho2ProgramacaoOrientada.Conta
        ("Filipe", "584.852.413-60", "(43)999445216", "21/09/1995", 2, 7900, "Conta-Poupanca");

        conta1.imprimeDados();
        System.out.println(" ");

        conta2.imprimeDados();
        System.out.println(" ");

        conta1.deposito(150,conta1);
        conta1.devolveSaldo();

        conta2.saque(1250);
        conta2.devolveSaldo();

        conta1.transfere(conta2, 550);
        conta1.devolveSaldo();
        conta2.devolveSaldo();
    }
}
